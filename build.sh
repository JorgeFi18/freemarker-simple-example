#!/bin/bash

# Compile
javac -cp "lib/*" src/*.java -d .
# Run
java -cp ".:lib/*" Main