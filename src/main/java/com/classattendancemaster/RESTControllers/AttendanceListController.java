package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.AttendanceListDAOImpl;
import com.classattendancemaster.DAOImpl.StudentDAOImpl;
import com.classattendancemaster.Entities.AttendanceList;
import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.SmartCard.Main;
import com.classattendancemaster.SmartCard.SmartcardConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.smartcardio.CardException;
import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
@RestController
@RequestMapping("/attendance")
public class AttendanceListController {
    Logger LOGGER = LoggerFactory.getLogger(AttendanceListController.class);
    SmartcardConnector smartcardConnector = new SmartcardConnector();

    private final StudentDAOImpl studentDAO;
    final AttendanceListDAOImpl attendanceListDAO;

    @Autowired
    public AttendanceListController(AttendanceListDAOImpl attendanceListDAO, StudentDAOImpl studentDAO) {
        this.attendanceListDAO = attendanceListDAO;
        this.studentDAO = studentDAO;
    }

    @GetMapping("/{id}")
    public AttendanceList get(@PathVariable Long id) {
        return attendanceListDAO.findOne(id);
    }

    @GetMapping(value = "")
    public List<AttendanceList> getAll() {
        return attendanceListDAO.findAll();
    }

    @RequestMapping("/create")
    public void create(@RequestBody AttendanceList attendanceList) {
        attendanceListDAO.save(attendanceList);
    }

    @RequestMapping("/{id}/students")
    public List<Student> getStudentList(@PathVariable Long id) {
        AttendanceList attendanceList = attendanceListDAO.findOne(id);
        return attendanceList.getStudentList();
    }

    @RequestMapping("/{id}/students/add")
    public void addToStudentList(@PathVariable Long id, @RequestBody Student student) {
        AttendanceList attendanceList = attendanceListDAO.findOne(id);
        List<Student> students = attendanceList.getStudentList();
        Student studentDummy = studentDAO.findByAlbumNumber(student.getAlbumNumber());
        if (studentDummy == null) {
            studentDAO.save(student);
            students.add(student);
            attendanceList.setStudentList(students);
            attendanceListDAO.save(attendanceList);
        }
        else {
            students.add(student);
            attendanceList.setStudentList(students);
            attendanceListDAO.save(attendanceList);
        }
    }

    @RequestMapping("/{id}/students/addCard")
    public void getStudentFromCard(@PathVariable Long id) throws CardException {
            try {
                smartcardConnector.initializeTerminal();
                if (smartcardConnector.cardTerminal.isCardPresent()) {
                    smartcardConnector.connectCard();
                    Student student = smartcardConnector.getCardUserData();
                    addToStudentList(id, student);
//                    smartcardConnector.cardTerminal.waitForCardAbsent(100000);
                }

            } catch (Exception e) {
                LOGGER.info(e.getMessage());
            }
        }
}
