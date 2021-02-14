cmake_minimum_required(VERSION 3.7...3.19)

if (${CMAKE_VERSION} VERSION_LESS 3.12)
    cmake_policy(VERSION ${CMAKE_MAJOR_VERSION}.${CMAKE_MINOR_VERSION})
endif()

# project name
project(SOM VERSION 1.0
        LANGUAGES CXX
)

# specification of C++ standard
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED True)

add_executable(som src/main.cpp)
target_link_libraries(som ${CMAKE_SOURCE_DIR}/src/parsing/third-party/antlr4-runtime.lib)
target_include_directories(som PRIVATE ${CMAKE_SOURCE_DIR}/src/parsing/third-party/antlr4-4.9.1/runtime/Cpp/runtime/src)
