SENG360 Assignment 2
Geoffrey Lorne
Tanner Zinck
Jake Cooper

An AES implementation in java oh boy.

Compile:
javac *.java

Usage:
java AES <option> <keyFile> <inputFile>

where keyFile is a key file, inputFile (no extension) names a file containing lines
of plaintext, and option is "e" or "d" for encryption and decryption,
respectively. keyFile contains a single line of 64 hex characters, which represents
a 256-bit key. The inputFile should have 32 hex characters per line. (For
simplicity, we will not worry about padding and just assume that the input fits
exactly into multiple lines of 32 hex characters.)
