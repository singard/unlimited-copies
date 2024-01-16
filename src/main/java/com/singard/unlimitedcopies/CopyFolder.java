package com.singard.unlimitedcopies;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;

@Service
public class CopyFolder {

	public void copyFolder(String sourceFolder, String destinationFolder) throws IOException {
		// Convertir les chemins en objets Path
		Path sourcePath = Paths.get(sourceFolder);
		Path destinationPath = Paths.get(destinationFolder);

		// Crée le dossier de destination s'il n'existe pas
		Files.createDirectories(destinationPath);

		// Copie le contenu du dossier source vers le dossier destination
		Files.walk(sourcePath, FileVisitOption.FOLLOW_LINKS)
		.forEach(source -> {
			try {
				Path destination = destinationPath.resolve(sourcePath.relativize(source));
				Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace(); // Gérer les exceptions appropriées selon vos besoins
			}
		});
	}
	
	

}
