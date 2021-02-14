#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "parsing/antlr4-runtime/SOMParser.h"
#include "parsing/antlr4-runtime/SOMLexer.h"

int main(int argc, char** argv)
{
    // Check for input arguments number
    if (argc <= 1) {
        std::cerr << "Invalid input arguments.\n";
        return 1;
    }

    // Open the file as standard c++ stream
    std::ifstream inputFile;
    inputFile.open(argv[1]);
    if (!inputFile) {
        std::cerr << "Unable to open source file: " << argv[1] << std::endl;
        return -1;
    }


    inputFile.close();
    return 0;
}