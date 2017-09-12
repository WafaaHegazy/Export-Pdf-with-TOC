package com.cloud9ers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud9ers.view.PdfView;


@Controller
public class Export {


    /**
     * Handle request to download an Excel document
     */
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public PdfView download(final Model model) {
        final PdfView view = new PdfView();
        return view;
    }


}
