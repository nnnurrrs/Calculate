package kz.kazpost.webservices.calculate.service;

import kz.kazpost.webservices.calculate.schema.CalculateRequest;
import kz.kazpost.webservices.calculate.schema.CalculateResponse;


public interface InitProcessService {
    CalculateResponse cal(CalculateRequest request);
}
