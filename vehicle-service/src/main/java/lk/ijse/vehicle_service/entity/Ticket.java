package lk.ijse.vehicle_service.entity;

import jakarta.persistence.*;
import lk.ijse.vehicle_service.service.util.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @ManyToOne
    @JoinColumn(name = "user_name", nullable = false)
    private User userName;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    private String date;
    private String time;
    private String amount;
    private String entryPoint;
    private String exitPoint;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;
}
