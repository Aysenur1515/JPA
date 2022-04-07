package com.jforce.tr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.tr.modal.Ders;

import com.jforce.tr.repository.DersRepository;
@Service
public class DersServicesImpl implements DersServices{
	@Autowired
	DersRepository dersRepository;
	@Override
	public List<Ders> getList() {
		// TODO Auto-generated method stub
		return dersRepository.findAll();
}
}
