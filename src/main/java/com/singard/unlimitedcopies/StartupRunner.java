package com.singard.unlimitedcopies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StartupRunner implements ApplicationRunner  {

	@Autowired
    private CopyFolder copyFolder;
	
	@Autowired
    private FileTransfer fileTransfer;


	@Override
	public void run(ApplicationArguments args) throws Exception {
	
        log.info("Application running");
        
        // Spécifiez le chemin du dossier source et du dossier destination
        String sourceFolder = fileTransfer.getSourceFolderPath();
        String destinationFolder = fileTransfer.getDestinationFolderPath();

        // Appelez le service de copie
        copyFolder.copyFolder(sourceFolder, destinationFolder);
	}
	 
	
	

}
