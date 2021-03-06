package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.advice.TenantNotFoundException;
import com.entities.Tenant;

@Service
public interface ITenantService {
	public Tenant addTenant(Tenant tenant) ;
	public String updateTenant(Tenant tenant) throws Exception;
	public Optional<Tenant> viewTenant(int id) throws  Exception ;
	public List<Tenant> viewAllTenant();
	public String deleteTenant() throws TenantNotFoundException;
	public String deleteTenant(int id) throws TenantNotFoundException ;
	
//	public Tenant validateTenant(int tenantId);

}
