/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.demo.entity.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    
}
