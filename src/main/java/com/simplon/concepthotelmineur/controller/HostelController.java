package com.simplon.concepthotelmineur.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HostelController {

    @PostMapping("/reservation")
    public String processReservation(HttpServletRequest request, HttpSession session) {
        String selectedHostelName = request.getParameter("selectedHostelName");
        String selectedHostelAddress = request.getParameter("selectedHostelAddress");
        String selectedHostelPostalCode = request.getParameter("selectedHostelPostalCode");
        String selectedHostelCity = request.getParameter("selectedHostelCity");
        String selectedDateArrived = request.getParameter("selectedDateArrived");
        String selectedDepartureDate = request.getParameter("selectedDepartureDate");
        String selectedRoom = request.getParameter("selectedRoom");
        String selectedRoomPrice = request.getParameter("selectedRoomPrice");
        String[] selectedBenefits = request.getParameterValues("selectedBenefits");
        String[] selectedBenefitsPrice = request.getParameterValues("selectedBenefitsPrice");

        session.setAttribute("selectedHostelName", selectedHostelName);
        session.setAttribute("selectedHostelAddress", selectedHostelAddress);
        session.setAttribute("selectedHostelPostalCode", selectedHostelPostalCode);
        session.setAttribute("selectedHostelCity", selectedHostelCity);
        session.setAttribute("selectedDateArrived", selectedDateArrived);
        session.setAttribute("selectedDepartureDate", selectedDepartureDate);
        session.setAttribute("selectedRoom", selectedRoom);
        session.setAttribute("selectedRoomPrice", selectedRoomPrice);
        session.setAttribute("selectedBenefits", selectedBenefits);
        session.setAttribute("selectedBenefitsPrice", selectedBenefitsPrice);

        return "redirect:/reservation";
    }
}