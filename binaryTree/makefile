build:
	cc -c binaryTree.c
	cc -o main binaryTree.o main.c

all: build

test: 
	valgrind --leak-check=yes ./main

