package edu.upc.fib.ossim.memory.model;

import edu.upc.fib.ossim.utils.ColorCell;

import java.util.Vector;


/**
 * Abstraction for process objects as they are manage by file system.
 * In non contiguous memory management algorithms processes are divided into smaller pieces (components)
 * such as pages or segments, otherwise processes are treated as indivisible memory objects.
 * With composite pattern both are used in the same way
 *
 * @author Alex Macia
 * @see ProcessComplete
 * @see ProcessComponent
 */
public interface ProcessMemUnit {

    /**
     * Complete Processes returns itself, components returns their parents
     *
     * @return Complete Processes returns itself, components returns their parents
     */
    ProcessComplete getParent();

    /**
     * Gets identifier
     *
     * @return identifier
     */
    int getPid();

    /**
     * Gets size
     *
     * @return size
     */
    int getSize();

    /**
     * Gets info
     *
     * @see ColorCell
     */
    Vector<Object> getInfo();

    /**
     * Returns xml information, pairs attribute name - attribute value,
     *
     * @return    xml information
     */
    Vector<Vector<String>> getXMLInfo();

    /**
     * Clones this
     *
     * @return cloned object
     */
    ProcessMemUnit clone();
}
