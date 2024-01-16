package com.singard.unlimitedcopies;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Configuration
@Getter
public class FileTransfer {

	@Value("${source.folder.path}")
	private String sourceFolderPath;

	@Value("${destination.folder.path}")
	private String destinationFolderPath;

}
