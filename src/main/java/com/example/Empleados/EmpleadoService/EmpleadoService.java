package com.example.Empleados.EmpleadoService;

import com.example.Empleados.Empleado.Empleado;
import com.example.Empleados.EmpleadoRepository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> getEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleado getEmpleadoById(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Empleado actualizarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}
