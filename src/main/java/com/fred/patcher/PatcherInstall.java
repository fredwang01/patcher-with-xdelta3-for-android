package com.fred.patcher;

public class PatcherInstall {
	private static boolean libLoaded;
	private static native int patch(int encode, String inFilePath, String srcFilePath, String outFilePath);
	
	public static int install(String inFilePath, String oldFilePath, String outFilePath) {
		if (libLoaded == false) {
			System.loadLibrary("patch");
			libLoaded = true;
		}
		return patch(0, inFilePath, oldFilePath, outFilePath);
	}
}