/**
 * 
 */
package com.asa.atom.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.util.Assert;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@Slf4j
public class CsvFileDataUtils {
	
	public static final String COMMA_DELIMITER = ",";
	public static final int CHUNK_SIZE = 25;
	
	public static List<String[]> readCsvFile(File csvFile) {
		
		Assert.notNull(csvFile, "csv file is required");
		Scanner scanner = null;
		List<String[]> records = new ArrayList<>();
		try {
			scanner = new Scanner(csvFile);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] values =  line.split(COMMA_DELIMITER, CHUNK_SIZE);
				records.add(values);
			}
		}catch (FileNotFoundException e) {
			log.error(csvFile.getAbsolutePath() +" not found");
		}finally {
			if(scanner != null) scanner.close();
		}
		return records;
	}

}
