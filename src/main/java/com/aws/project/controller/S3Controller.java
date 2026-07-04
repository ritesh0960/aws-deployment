package com.aws.project.controller;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/s3")
public class S3Controller {
    @Autowired
    private AmazonS3 amazonS3;
    @GetMapping("/hello")
    public String getHello(){
        return "Hello User";
    }

    @GetMapping("/buckets")
    public ResponseEntity<?> listBucket(){
        try{
           return ResponseEntity.ok(amazonS3.listBuckets());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
