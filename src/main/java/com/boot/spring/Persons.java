package com.boot.spring;

import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;

/**
 * Created by darlan on 27/01/17.
 */
@RestController
@RequestMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
public class Persons {

    static final Long TIMEOUT = 999999L;

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET)
    public DeferredResult<List<Person>> list() {
        final DeferredResult<List<Person>> res = new DeferredResult<>(TIMEOUT);
        Observable<List<Person>> observable = this.personRepository.list();
        observable.subscribe(res::setResult, res::setErrorResult);
        return res;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<Person> post(@RequestBody Person person) {
        final DeferredResult<Person> res = new DeferredResult<>(TIMEOUT);
        Observable<Person> observable = this.personRepository.post(person);
        observable.subscribe(res::setResult, res::setErrorResult);
        return res;
    }

}
