package com.nenuharsha.views;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nenuharsha.representations.IFSC;
import io.dropwizard.views.View;

public class InsertIFSC extends View {
    public InsertIFSC(){
        super("InsertIFSCCode.ftl");
    }
}
