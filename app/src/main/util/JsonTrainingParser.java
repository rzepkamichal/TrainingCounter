package main.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.model.Training;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonTrainingParser {

    private ObjectMapper mapper;
    private String fileName;

    public JsonTrainingParser(){
        this.mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        this.fileName = null;

    }

    public JsonTrainingParser(String fileName){

        this.mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        this.fileName = fileName;
    }

    public List<Training> loadTrainingList(){

        List<Training> trainingList = null;
        try {
            trainingList = mapper.readValue(new File("trainings.json"), new TypeReference<List<Training>>(){});
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trainingList;
    }
}
