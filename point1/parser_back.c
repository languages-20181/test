#include <stdio.h>
#include <string.h>
#include <stdbool.h>

/*      
    *******************
    * OUR GRAMATIC *
    *******************
    *   S :: = cAd
    *   A :: = ab | a
*/
/*
    **********************************************************
                        * PARSING TRACE *
    **********************************************************
    Expansion   |   Remaining input     |   Action
    S               cad                     Try S :: = cAd
    cAd             cad                     Match c
    Ad              ad                      Try A :: = ab
    abd             ad                      Match a
    bd              d                       Dead end, backtrack
    ad              ad                      Try A :: = a
    ad              ad                      Match a
    d               d                       Match d
    String Accepted!
*/

/* Prototype for each of the parsing functions we'll use */
bool S(char *s[]);
bool A(char *s[]);
bool A1(char *s[]);
bool A2(char *s[]);

/* Two helper functions well need */
void SkipWhitespace(char *s[]);
bool FormulaWrapper(char *s[]);
 
/* 
    Some string constants (so I don't have to type these 
    out ever again, and they can be easily changed) 
*/
const char *VOWEL_A     = "a";
const char *VOWEL_C     = "c";
const char *VOWEL_D     = "d";
const char *STRING_AB      = "ab";
 
/* 
    A constant denoting the maximum length (in character) 
    of any proposition
*/
const int  MAX_PROP_LENGTH = 50;


/*
    **********************************************************
    * Our TWO HELPER Functions, "SkipWhiteSpace" and "match".*
    **********************************************************
*/

/* Advances the input string past any white space, it is like a NextToken */
void SkipWhitespace(char *s[]) 
{
    while (*s[0] == ' ' || *s[0] == '\n' || *s[0] == '\t')
        *s = *s + 1;
}
 
/* 
    Compares the input string against a fixed, known string (token).
    If it maches, the input string is advanced past the token and
    true is returned.  Otherwise, the input string remains unchnaged
    and false is returned.
*/
bool match(char *s[], const char *token) 
{
    if (strncmp(*s, token, strlen(token)) == 0) 
    {
        *s = *s + strlen(token);
        return true;
    }
    return false;
}

/*
    ************************
    * Our PARSER FUNCTIONS *
    ************************

    ALL of them behave in the following, identical fashion:
        function "bool X(char *s[])" will
            1. Compare the input string "s" against the expression 
               it represents.
            2. IF the input string matches the expressions, THEN
               the input string will be advanced past the expression, and
               true will be returned.
            3. OTHERWISE, if the input string does not match the expression, THEN
               the input string will remain unchanged and false will be
               returned. (BACKTRACKING)
*/
 /* Identify S, this is a SEQUENCE rule. */
bool S(char *s[]) 
{
    char *original = *s;
    SkipWhitespace(s);
    if (!match(s, VOWEL_C))
    {
        *s = original;
        return false;
    }else{
        printf("Match %s\n", VOWEL_C);
    }
 
    if (!A(s)) 
    {
        *s = original;
        printf("Dead end");
        return false;
    }

    if (!match(s, VOWEL_D))
    {
        *s = original;
        return false;
        printf("Dead end");
    }else{
        printf("Match %s\n", VOWEL_D);
    }
 
    return true;
}

 /* Identify A (either 'ab' or 'a'*/
 bool A(char *s[]) 
 {
    char *original = *s;
    SkipWhitespace(s);
    /* Here the backtracking is functional  */
    if (A1(s) || A2(s) )
       return true;
 
   *s = original;
    return false;
 }
 bool A1(char *s[]) 
 {
    char *original = *s;
    SkipWhitespace(s);
    if (match(s, STRING_AB))
    {
        printf("Match %s \n",STRING_AB);
        return true;
    }  
 
    *s = original;
    printf("Dead end, Backtrack\n");
    return false;
 }
 bool A2(char *s[]) 
 {
    char *original = *s;
    SkipWhitespace(s);
    /* Here the backtracking is functional  */
    if (match(s, VOWEL_A))
    {
        printf("Match %s \n",VOWEL_A);
        return true;
    }  
 
    *s = original;
    printf("Dead end, Backtrack\n");
    return false;
 }
/*
    **********************************************************
    * Our WRAPPER FUNCTION for parsing*
    * This is what we call to check if a string is accepeted.
    **********************************************************
*/
bool FormulaWrapper(char *s[]) 
{
    char *original = *s;
 
    if (S(s)) 
    {
        SkipWhitespace(s);
        if (*s[0] == '\0')
            return true;
        else 
        {
            *s = original;
            return false;
        }
    }
    return false;
}
 
 /*
    **********************************************************
    * TEST PROGRAM  *
    * It prompts the user to enter expression,
    * one per line (max 50 characters per line)
    * and then parses it, telling the user 
    * if what they entered was accepted or reject.
    **********************************************************
*/
int main(int argc, char *argv[])
{
    /* buffer to store string read-in from user */
    const int MAX_LINE_SIZE = 1000;
    char input[MAX_LINE_SIZE];
    char *copy;
 
    /* prompt user */
    printf("--------------- RECURSIVE DESCENT BACKTRACKING ---------------\n");
    printf("Enter expression to evaluate, one per line (max %d characters)\n",
       MAX_LINE_SIZE);
    printf("Each time We'll tell you if it's accepted or reject.\n");
    printf("Hit CTRL+D to exit.\n");
 
    /* start loop ... */
    while (fgets(input, MAX_LINE_SIZE, stdin) != NULL) 
    {
       /* 
        reset 'copy' to point to start of input buffer
       */
        copy = input;
        if (FormulaWrapper(&copy))
            printf("---> String Accepted      ;)\n");
        else
            printf("---> String Reject        :(\n");
    }
    
    return 0;
 }