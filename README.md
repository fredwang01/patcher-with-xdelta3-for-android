"# patcher-with-xdelta3-for-android" 

Xdelta v3 is a binary diff method. It can compare two files to produce the diff patch,  
reversely it can also apply the patch and old file to produce the new file.
please visit the Xdelta v3 GitHub project [here](https://github.com/jmacd/xdelta).

I compiled the Xdelta v3 library for android platform to update the APK file which can 
reduce the need of bandwidth when downloading the patch file from network server, as it is smaller usually.

In the original file `patch.c` of Xdelta v3 , some system call do not check the return value, i fixed these issues.

The market of Google Play use bsddiff method to update binary APK, recently a more advanced method is introduced for Google Play,
which implement file-by-file patch inside an archive file. please visit it's GitHub project [here](https://github.com/andrewhayden/archive-patcher) for more details.



