package com.selflearning.util;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;
import com.selflearning.model.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;

import java.io.PrintWriter;
import java.util.List;

public class WriteCsvToResponse {
    private static final Logger LOGGER= LoggerFactory.getLogger(WriteCsvToResponse.class);

    public static void writeCities(PrintWriter writer, List<City> cities){
        try{
            ColumnPositionMappingStrategy<City> mappingStrategy= new ColumnPositionMappingStrategy<>();
            mappingStrategy.setType(City.class);
            String[] columns= new String [] {"id","name","population"};
            mappingStrategy.setColumnMapping(columns);
            StatefulBeanToCsv<City> btcsv = new StatefulBeanToCsvBuilder<City>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withMappingStrategy(mappingStrategy)
                    .withSeparator(',')
                    .build();
            btcsv.write(cities);

        }
        catch(CsvException e){
            LOGGER.error("Error mapping Bean to CSV",e);
        }
    }

    public static void writeCity(PrintWriter writer, City city) {

        try {

            ColumnPositionMappingStrategy<City> mapStrategy
                    = new ColumnPositionMappingStrategy<>();

            mapStrategy.setType(City.class);

            String[] columns = new String[]{"id", "name", "population"};
            mapStrategy.setColumnMapping(columns);

            StatefulBeanToCsv<City> btcsv = new StatefulBeanToCsvBuilder<City>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withMappingStrategy(mapStrategy)
                    .withSeparator(',')
                    .build();

            btcsv.write(city);

        } catch (CsvException ex) {

            LOGGER.error("Error mapping Bean to CSV", ex);
        }
    }
}
