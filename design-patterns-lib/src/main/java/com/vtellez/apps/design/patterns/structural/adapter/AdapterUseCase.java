package com.vtellez.apps.design.patterns.adapter;

/**
 * This is an use case example of the Adapter design pattern.
 *
 * Created by PC_02 on 19/11/2015.
 */
public class AdapterUseCase {

    /**
     * Example
     */
    public static void useCaseExample() {

        FileExplorerManager fileExplorerManager = new FileExplorerManager();
        fileExplorerManager.createFile();
        fileExplorerManager.readFile();
        fileExplorerManager.removeFile();
        fileExplorerManager.writeFile();
    }
}
