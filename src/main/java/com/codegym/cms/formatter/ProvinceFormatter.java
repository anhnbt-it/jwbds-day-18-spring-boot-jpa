package com.codegym.cms.formatter;

import com.codegym.cms.model.Province;
import com.codegym.cms.service.ProvinceService;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

public class ProvinceFormatter implements Formatter<Optional<Province>> {
    private ProvinceService provinceService;

    public ProvinceFormatter(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @Override
    public Optional<Province> parse(String text, Locale locale) throws ParseException {
        return provinceService.findById(Long.valueOf(text));
    }

    @Override
    public String print(Optional<Province> object, Locale locale) {
        return object.toString();
    }
}
