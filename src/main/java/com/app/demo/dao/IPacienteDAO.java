package com.app.demo.dao;


import com.app.demo.domain.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface IPacienteDAO extends CrudRepository<Paciente, Integer> {
}
