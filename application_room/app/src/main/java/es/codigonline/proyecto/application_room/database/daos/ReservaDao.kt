package es.codigonline.proyecto.application_room.database.daos

import androidx.room.Dao
import es.codigonline.proyecto.application_room.database.entities.Cliente
import es.codigonline.proyecto.application_room.database.entities.Reserva

@Dao
abstract class ReservaDao : BaseDao<Reserva>() {

}