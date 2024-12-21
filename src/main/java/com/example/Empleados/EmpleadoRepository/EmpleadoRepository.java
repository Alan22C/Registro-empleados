package com.example.Empleados.EmpleadoRepository;

import com.example.Empleados.Empleado.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository <Empleado, Long> {
}
