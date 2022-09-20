package Models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.*;

public class Environment {

    Map<String, EnvironmentSpecification> environments = new LinkedHashMap<>();

    @JsonAnySetter
    void setEnvironment(String key, EnvironmentSpecification envSpecification) { environments.put(key, envSpecification); }

    @JsonAnyGetter
    public List<EnvironmentSpecification> getEnvironments() { return environments.values().stream().toList(); }

}
