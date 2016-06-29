# JNIDemo
Uses the DLL file.

#1. To specify the dll file, just set the directory path, in VM Options, which has the DLL file. Do not end library path with backslash(for Windows). E.g.:
-Djava.library.path="Path_to_directory_with_DLL"

#2. Please also set the jdk/include and jdk/include/win32 paths along with above-mentioned header-file directory path in the additional path parameter in Visual Studio.
