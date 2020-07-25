package com.rapid.workload.workloadcore;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.rapid.workload.jpa.SubOrderRepository;
import com.rapid.workload.model.SubOrder;

@SpringBootApplication
public class WorkloadCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkloadCoreApplication.class, args);
	}
	
	/*
	@Bean 
	
	com.rapid.workload.jpa.SubOrderRepository subOrderRepository() {
		return new SubOrderRepository() {
			
			@Override
			public <S extends SubOrder> Optional<S> findOne(Example<S> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends SubOrder> Page<S> findAll(Example<S> arg0, Pageable arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends SubOrder> boolean exists(Example<S> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public <S extends SubOrder> long count(Example<S> arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public <S extends SubOrder> S save(S arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<SubOrder> findById(Integer arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean existsById(Integer arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void deleteById(Integer arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll(Iterable<? extends SubOrder> arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void delete(SubOrder arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public long count() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Page<SubOrder> findAll(Pageable arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends SubOrder> S saveAndFlush(S arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends SubOrder> List<S> saveAll(Iterable<S> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public SubOrder getOne(Integer arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void flush() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public List<SubOrder> findAllById(Iterable<Integer> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends SubOrder> List<S> findAll(Example<S> arg0, Sort arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends SubOrder> List<S> findAll(Example<S> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<SubOrder> findAll(Sort arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<SubOrder> findAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void deleteInBatch(Iterable<SubOrder> arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAllInBatch() {
				// TODO Auto-generated method stub
				
			}
		};
	} */

}
