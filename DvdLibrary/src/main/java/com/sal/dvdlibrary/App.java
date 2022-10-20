/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.sal.dvdlibrary;

/**
 * Allow the user to add a DVD to the collection Allow the user to remove a DVD
 * from the collection Allow the user to edit the information for an existing
 * DVD in the collection Allow the user to list the DVDs in the collection Allow
 * the user to display the information for a particular DVD Allow the user to
 * search for a DVD by title Load the DVD library from a file Save the DVD
 * library back to the file when the program completes Allow the user to add,
 * edit, or delete many DVDs in one session
 *
 * Additionally, the program must follow the MVC design pattern and use
 * dependency injection as shown in the course material.
 *
 * You should follow the process outlined in the Agile Approach Checklist for
 * Console Applications document elsewhere in this course.
 *
 * Your DVD data transfer object should have the following fields: This is all
 * your input: Title Release date MPAA rating Director's name Studio User rating
 * or note (allows the user to enter additional information, e.g., "Good family
 * movie")
 *
 * @author katyb
 */
import com.sal.dvdlibrary.controller.DvdLibraryController;
import com.sal.dvdlibrary.dao.DvdLibraryDaoFileImpl;
import com.sal.dvdlibrary.dao.dvdLibraryDao;
import com.sal.dvdlibrary.ui.DvdLibraryView;
import com.sal.dvdlibrary.ui.UserIO;
import com.sal.dvdlibrary.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        DvdLibraryView myView = new DvdLibraryView(myIo);

        dvdLibraryDao myDao = new DvdLibraryDaoFileImpl();
        DvdLibraryController controller = new  DvdLibraryController(myDao, myView);

        //ClassRosterController controller = new ClassRosterController();
        controller.run();
    }
}
