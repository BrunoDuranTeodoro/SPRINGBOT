package br.com.aweb.sistema_reservas.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aweb.sistema_reservas.dto.ReservasDTO;

@RestController
@RequestMapping("/reservas")
public class ReservasController {
    

    private Map<Long, ReservasDTO> reserva = new HashMap<>();
    private Long nextId = 1L;

    @PostMapping
    public ReservasDTO createReservas(@RequestBody ReservasDTO reservas){
        reservas.setId(nextId++);
        reserva.put(reservas.getId(),reservas);
        return reservas;
    } 

    @GetMapping("/{nome}")
    public List<ReservasDTO> allReservas(){
        return new ArrayList<>(reserva.values());
    }
    
    @DeleteMapping("/cliente/{nome}")
    public String deleteReservas(@PathVariable Long id){
        if (reserva.remove(id) != null)
            return "Reserva de cancelada!";
        return "Reserva não encontrado!";
    }

}
