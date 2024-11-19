build:
	cc -c DoubleHeadedLinkedList.c 
	cc -o main main.c DoubleHeadedLinkedList.o


clean:
	rm DoubleHeadedLinkedList.o

leaktest: build 
	valgrind --leak-check=yes ./main

test: build
	./main
	
all: build
