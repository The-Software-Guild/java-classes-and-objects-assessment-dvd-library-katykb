/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sal.dvdlibrary.ui;

import com.sal.dvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author salajrawi
 */
public class DvdLibraryView {

    private UserIO io;

    public DvdLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DvDs");
        io.print("2. View a Dvd");
        io.print("3. Create a New DvD");
        io.print("4. Remove a DvD");
        io.print("5. Edit a Dvd");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public int printEditMenuAndGetSelection() {
        io.print("1. Please enter Dvd Title");
        io.print("2. Please enter the director's name.");
        io.print("3. Please enter release date.");
        io.print("4. Pleae enter MPAA");
        io.print("5. Pleae enter Studio name");
        io.print("6. Please enter a rating. For example: Good, great, sucked");

        return io.readInt("Please select from the above choices.", 1, 5);

    }

    /*
     This method prompts the user for dvd ID, First Name, Last Name, and Cohort, 
    gathers this information, creates a new dvd object, and returns it to the caller.
     */
    public Dvd getNewDvDInfo() {
        String title = io.readString("Please enter Dvd Title");
        String DirectorsName = io.readString("Please enter the director's name.");
        String ReleaseDate = io.readString("Please enter release date.");
        String MPAA = io.readString("Pleae enter MPAA");
        String Studio = io.readString("Pleae enter Studio name");
        Dvd currentDvd = new Dvd(title);
        currentDvd.setDirectorsName(DirectorsName);
        currentDvd.setReleaseDate(ReleaseDate);
        currentDvd.setMPAA(MPAA);
        currentDvd.setStudio(Studio);
        return currentDvd;
    }

    /*
    This method simply displays a banner or heading to the UI indicating that 
    the next interactions on the screen will be for creating a new dvd
     */
    public void displayCreateDvDBanner() {
        io.print("=== Create DvD ===");
    }

    /*
    The second method displays a message that the new dvd was successfully created
    and waits for the user to hit Enter to continue
     */
    public void displayCreateSuccessBanner() {
        io.readString(
                "DvD successfully created.  Please hit enter to continue");
    }

    /*
    A method that takes a list of DVD objects as a parameter and displays the information for each Dvd to the screen.
     */
    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd currentDvd : dvdList) {
            String dvdInfo = String.format("#%s : %s %s",
                    currentDvd.getTitle(),
                    currentDvd.getDirectorsName(),
                    currentDvd.getReleaseDate(),
                    currentDvd.getStudio(),
                    currentDvd.getMPAA(),
                    currentDvd.getUserRating());

            io.print(dvdInfo);
        }
        io.readString("please hit enter to continue");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All Dvds ===");
    }

    public void displayDisplayDvdBanner() {
        io.print("=== Display Dvd ===");
    }

    /*
    Get the dvd title to display information
     */
    public String getDvdTitleChoice() {
        return io.readString("Please enter the dvd title.");
    }

    /*
    Displays the dvd information
     */
    public void displayDvd(Dvd dvd) {
        if (dvd != null) {
            io.print(dvd.getTitle());
            io.print(dvd.getDirectorsName());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getStudio());
            io.print(dvd.getMPAA());
            io.print(dvd.getUserRating());

        } else {
            io.print("No such DvD in Library");
        }
        io.readString("Please hit enter to continue");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove Dvd ===");
    }

    public void displayRemoveResult(Dvd dvdRecord) {
        if (dvdRecord != null) {
            io.print("DvD successfully removed!");
        } else {
            io.print("No such DvD in library");
        }
        io.readString("Please hit enter to continue");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public void displayEditDvdBanner() {
        io.print("=== Edit DVD ===");
    }

    public void displayEditDvdSuccess() {
        io.readString(
                "DVD successfully Edited.  Please hit enter to continue");
    }

    public void displayEditReleaseDateBanner() {
        io.print("=== Edit DVD Release Date ===");
    }

    public void displayEditMpaaBanner() {
        io.print("=== Edit DVD MPAA rating ===");
    }

    public void displayEditDirectorNameBanner() {
        io.print("=== Edit DVD Director's Name ===");
    }

    public void displayEditStudio() {
        io.print("=== Edit DVD Studio ===");
    }

    public void displayEditUserRating() {
        io.print("=== Edit DVD User Rating ===");
    }

    public String getNewReleaseDate() {
        return io.readString("Please enter new release date.");
    }

    public String getNewMpaaRating() {
        return io.readString("Please enter new MPAA rating.");
    }

    public String getNewDirectorName() {
        return io.readString("Please enter new director's name.");
    }

    public String getNewUserRating() {
        return io.readString("Please enter new user rating.");
    }

    public String getNewStudio() {
        return io.readString("Please enter new studio.");
    }

    public void displayNullDVD() {
        io.print("No such DVD.");
        io.readString("Please hit enter to continue.");
    }
}
