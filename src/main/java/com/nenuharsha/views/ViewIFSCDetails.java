package com.nenuharsha.views;

import com.nenuharsha.representations.IFSC;
import io.dropwizard.views.View;

public class ViewIFSCDetails extends View {
    private final IFSC ifsc;

    public ViewIFSCDetails(IFSC ifsc){
        super("viewIFSCDetails.ftl");
        this.ifsc=ifsc;
    }

    public IFSC getIfsc() {
        return ifsc;
    }
}