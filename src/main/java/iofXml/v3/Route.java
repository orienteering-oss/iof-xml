
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Defines a route, i.e. a number of geographical positions (waypoints) describing a competitor's navigation throughout a course.
 * 
 *         As routes contain large amounts of information, a compact storage format is utilized to keep the overall file size small. A route is stored as a base64-encoded byte sequence of waypoints. A waypoint is represented as described below. All multi-byte data types are stored in big-endian byte order (most significant byte first). Typically, a one-hour route with one-second waypoint recording interval occupies around 20 kilobytes.
 * 
 * 
 *         Waypoint header byte
 *         ====================
 *         Each waypoint byte sequence starts with a waypoint header byte:
 *         Waypoint header byte, bit 1: Waypoint type. 0 for normal waypoint, 1 for interruption waypoint. An interruption waypoint is a waypoint that is the last waypoint before an interruption in the route occurs, e.g. due to a satellite signal receiving failure. The last waypoint of a route should be a normal waypoint, not an interruption waypoint.
 *         Waypoint header byte, bits 2 and 3: Time storage mode. For a description of the time storage modes, see below.
 *         Bit 2   Bit 3   Time storage mode
 *         0      0      full storage mode (6 bytes)
 *         1      0      milliseconds delta storage mode (2 bytes)
 *         0      1      seconds delta storage mode (1 byte)
 *         Waypoint header byte, bits 4 and 5: Position storage mode (latitude, longitude, and altitude (if present)). For a description of the position storage modes, see below.
 *         Bit 4   Bit 5   Position storage mode
 *         0      0      full storage mode (4 + 4 (+ 3) bytes for latitude, longitude and altitude (if present))
 *         1      0      big delta delta storage mode (2 + 2 (+ 1) bytes)
 *         0      1      small delta storage mode (1 + 1 (+ 1) bytes)
 *         Waypoint header byte, bit 6: Altitude presence. 0 if an altitude value is not present, 1 if it is present.
 *         Waypoint header byte, bit 7: Unused, always 0.
 *         Waypoint header byte, bit 8: Unused, always 0.
 * 
 * 
 *         Time byte sequence
 *         ==================
 *         After the waypoint byte comes the time byte sequence. Depending on the time storage mode defined in the waypoint header, the time byte sequence is either 6 bytes (full), 2 bytes (milliseconds delta) or 1 byte (seconds delta) long.
 * 
 *         Full storage mode
 *         -----------------
 *         The following 6 bytes are an unsigned 48-bit integer defining the waypoint's time as the number of milliseconds (1/1000 seconds) since January 1, 1900, 00:00:00 UTC.
 * 
 *         Milliseconds delta storage mode
 *         -------------------------------
 *         The following 2 bytes are an unsigned 16-bit integer defining the waypoint's time as the number of milliseconds to add to the last waypoint's time.
 * 
 *         Seconds delta storage mode
 *         --------------------------
 *         The following byte is an unsigned 8-bit integer defining the waypoint's time as the number of seconds to add to the last waypoint's time. This storage mody can only be used when the difference to the last waypoint's time is an integer value.
 * 
 *         Consequently:
 *         - seconds delta storage mode is used when the waypoint's time is less than 256 seconds later than the last waypoint's time, and the difference between the times is an integer value.
 *         - milliseconds delta storage mode is used when the waypoint's time is less than 65.536 seconds later than the last waypoint's time
 *         - otherwise, full storage mode is used
 *         The time of the first waypoint of a route is always stored in full storage mode.
 * 
 * 
 *         Position byte sequence
 *         ======================
 *         Next, the position byte sequence appears: latitude, longitude and (if present) altitude bytes. Depending on the position storage mode defined in the waypoint header, the position byte sequence is either 4 + 4 (+ 3) bytes (full), 2 + 2 (+ 1) bytes (big delta) or 1 + 1 (+ 1) bytes (small delta) long.
 * 
 *         Full storage mode
 *         -----------------
 *         The first 4 bytes are a signed 32-bit integer defining the waypoint's latitude as microdegrees (1/1000000 degrees) relative to the equator. A negative value implies a latitude south of the equator. A microdegree is approximately equivalent to 0.1 meters.
 *         The following 4 bytes are a signed 32-bit integer defining the waypoint's latitude as microdegrees (1/1000000 degrees) relative to the Greenwich meridian. A negative value implies a longitude west of the Greenwich meridian. A microdegree is approximately equivalent to 0.1 meters at the equator and infinitely small at the poles.
 *         If the altitude presence bit in the waypoint header bit is set to 1, the following 3 bytes are a signed 24-bit integer defining the waypoint's altitude as decimeters (1/10 meters) relative to the sea level.
 * 
 *         Big delta storage mode
 *         ----------------------
 *         The first 2 bytes are a signed 16-bit integer defining the waypoint's latitude as the number of microdegrees to add to the last waypoint's latitude.
 *         The following 2 bytes are a signed 16-bit integer defining the waypoint's longitude as the number of microdegrees to add to the last waypoint's longitude.
 *         If the altitude presence bit in the waypoint header bit is set to 1, the following byte is a signed 8-bit integer defining the waypoint's altitude as the number of decimeters to add to the last waypoint's altitude.
 * 
 *         Small delta storage mode
 *         ----------------------
 *         The first byte is a signed 8-bit integer defining the waypoint's latitude as the number of microdegrees to add to the last waypoint's latitude.
 *         The following byte is a signed 8-bit integer defining the waypoint's longitude as the number of microdegrees to add to the last waypoint's longitude.
 *         If the altitude presence bit in the waypoint header bit is set to 1, the following byte is a signed 8-bit integer defining the waypoint's altitude as the number of decimeters to add to the last waypoint's altitude.
 * 
 *         Consequently:
 *         - small delta storage mode is used when the waypoint's latitude and longitude is within -0.000128 to 0.000127 degrees from the last waypoint's latitude, and when the altitude is not present or is within -12.8 to 12.7 meters from the last waypoint's altitude
 *         - big delta storage mode is used when the waypoint's latitude and longitude is within -0.032768 to 0.032767 degrees from the last waypoint's latitude, and when the altitude is not present or is within -12.8 to 12.7 meters from the last waypoint's altitude
 *         - otherwise, full storage mode is used
 *         The position of the first waypoint of a route is always stored in full storage mode.
 * 
 *         Code libraries for reading and writing route data is found in https://github.com/international-orienteering-federation/datastandard-v3/tree/master/libraries.
 * 
 * <p>Java class for Route complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Route">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>base64Binary">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "value"
})
public class Route {

    @XmlValue
    protected byte[] value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

}
