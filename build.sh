#!/bin/bash
mkdir -p out
find src/main/java -name "*.java" | xargs javac -d out