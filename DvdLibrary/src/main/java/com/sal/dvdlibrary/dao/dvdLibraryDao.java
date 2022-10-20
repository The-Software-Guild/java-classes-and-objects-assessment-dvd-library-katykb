package com.sal.dvdlibrary.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//package com.sal.dvdlibrary.dao;

import com.sal.dvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author salajrawi
 */
public interface dvdLibraryDao {
     /**
     * Adds the given Dvd to the library and associates it with the given
     * Title. If there is already a dvd associated with the given
     * title it will return that dvd object, otherwise it will
     * return null.
     *
     * @param title with which dvd is to be associated
     * @param dvd dvd to be added to the library
     * @return the dvd object previously associated with the given  
     * title if it exists, null otherwise
     */
    Dvd addDvd(String title, Dvd dvd) throws DvdLibraryDaoException;

    /**
     * Returns a List of all dvds in the library.
     *
     * @return List containing all dvds in the library.
     */
    List<Dvd> getAllDvds() throws DvdLibraryDaoException;

    /**
     * Returns the dvd object associated with the given title.
     * Returns null if no such dvd exists
     *
     * @param title title of the dvd to retrieve
     * @return the dvd object associated with the given title,  
     * null if no such dvd exists
     */
    Dvd getDvd(String title) throws DvdLibraryDaoException;

    /**
     * Removes from the library the dvd associated with the title.
     * Returns the dvd object that is being removed or null if
     * there is no dvd associated with the title
     *
     * @param title title of dvd to be removed
     * @return dvd object that was removed or null if no dvd
     * was associated with the given title
     */
    Dvd removeDvd(String title) throws DvdLibraryDaoException;
    /**
     * Edits the dvd associated with the title.
     * Returns the dvd object that is being edited or null if
     * there is no dvd associated with the title
     *
     * @param title title of dvd to be edited
     * @return dvd object that was edited or null if no dvd
     * was associated with the given title
     */
    Dvd editReleaseDate(String title, String newReleaseDate) throws DvdLibraryDaoException;

    Dvd editMPAA(String title, String newMpaaRating) throws DvdLibraryDaoException;

    Dvd editDirectorName(String title, String newDirectorName) throws DvdLibraryDaoException;

    Dvd editUserRating(String title, String newUserRating) throws DvdLibraryDaoException;

    Dvd editStudio(String title, String newStudioName) throws DvdLibraryDaoException;
}