package com.app.demo.service;

import com.app.demo.domain.Paciente;

import java.util.List;

public interface IPacienteService {

    List<Paciente> getAllPacientes();

    void savePaciente(Paciente paciente);

    void deletePaciente(Paciente paciente);

    Paciente findPaciente(Paciente paciente);

}
