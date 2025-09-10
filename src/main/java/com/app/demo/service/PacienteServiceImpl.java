package com.app.demo.service;

import com.app.demo.dao.IPacienteDAO;
import com.app.demo.domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService{

    @Autowired
    private IPacienteDAO iPacienteDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> getAllPacientes() {
        return (List<Paciente>) iPacienteDAO.findAll();
    }

    @Override
    @Transactional
    public void savePaciente(Paciente paciente) {
        iPacienteDAO.save(paciente);
    }

    @Override
    @Transactional
    public void deletePaciente(Paciente paciente) {
        iPacienteDAO.delete(paciente);

    }

    @Override
    @Transactional(readOnly = true)
    public Paciente findPaciente(Paciente paciente) {
        return iPacienteDAO.findById(paciente.getId()).orElse(null);
    }
}
