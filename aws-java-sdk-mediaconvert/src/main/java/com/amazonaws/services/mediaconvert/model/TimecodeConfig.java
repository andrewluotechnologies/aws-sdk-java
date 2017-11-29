/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Contains settings used to acquire and adjust timecode information from inputs.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TimecodeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimecodeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify a
     * timecode that will match the input video frame to the output video frame. Use 24-hour format with frame number,
     * (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for Anchor Timecode
     * varies depending on your setting for Timecode source (TimecodeSource). * If Timecode source (TimecodeSource) is
     * set to Specified Start (specifiedstart), the first input frame is the specified value in Start Timecode (Start).
     * Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate output timecode. * If Timecode source
     * (TimecodeSource) is set to Start at 0 (zerobased) the first frame is 00:00:00:00. * If Timecode source
     * (TimecodeSource) is set to Embedded (embedded), the first frame is the timecode value on the first input frame of
     * the input.
     */
    private String anchor;

    private String source;
    /**
     * Only use when you set Timecode Source (TimecodeSource) to Specified Start (SPECIFIEDSTART). Use Start timecode
     * (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     */
    private String start;
    /**
     * Only applies to outputs that support program-date-time stamp. Use Time stamp offset (TimestampOffset) to
     * overwrite the timecode date without affecting the time and frame number. Provide the new date as a string in the
     * format "yyyy-mm-dd". To use Time stamp offset, you must also enable Insert program-date-time
     * (InsertProgramDateTime) in the output settings.
     */
    private String timestampOffset;

    /**
     * If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify a
     * timecode that will match the input video frame to the output video frame. Use 24-hour format with frame number,
     * (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for Anchor Timecode
     * varies depending on your setting for Timecode source (TimecodeSource). * If Timecode source (TimecodeSource) is
     * set to Specified Start (specifiedstart), the first input frame is the specified value in Start Timecode (Start).
     * Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate output timecode. * If Timecode source
     * (TimecodeSource) is set to Start at 0 (zerobased) the first frame is 00:00:00:00. * If Timecode source
     * (TimecodeSource) is set to Embedded (embedded), the first frame is the timecode value on the first input frame of
     * the input.
     * 
     * @param anchor
     *        If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify
     *        a timecode that will match the input video frame to the output video frame. Use 24-hour format with frame
     *        number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for
     *        Anchor Timecode varies depending on your setting for Timecode source (TimecodeSource). * If Timecode
     *        source (TimecodeSource) is set to Specified Start (specifiedstart), the first input frame is the specified
     *        value in Start Timecode (Start). Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate
     *        output timecode. * If Timecode source (TimecodeSource) is set to Start at 0 (zerobased) the first frame is
     *        00:00:00:00. * If Timecode source (TimecodeSource) is set to Embedded (embedded), the first frame is the
     *        timecode value on the first input frame of the input.
     */

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    /**
     * If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify a
     * timecode that will match the input video frame to the output video frame. Use 24-hour format with frame number,
     * (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for Anchor Timecode
     * varies depending on your setting for Timecode source (TimecodeSource). * If Timecode source (TimecodeSource) is
     * set to Specified Start (specifiedstart), the first input frame is the specified value in Start Timecode (Start).
     * Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate output timecode. * If Timecode source
     * (TimecodeSource) is set to Start at 0 (zerobased) the first frame is 00:00:00:00. * If Timecode source
     * (TimecodeSource) is set to Embedded (embedded), the first frame is the timecode value on the first input frame of
     * the input.
     * 
     * @return If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify
     *         a timecode that will match the input video frame to the output video frame. Use 24-hour format with frame
     *         number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for
     *         Anchor Timecode varies depending on your setting for Timecode source (TimecodeSource). * If Timecode
     *         source (TimecodeSource) is set to Specified Start (specifiedstart), the first input frame is the
     *         specified value in Start Timecode (Start). Anchor Timecode (Anchor) and Start Timecode (Start) are used
     *         calculate output timecode. * If Timecode source (TimecodeSource) is set to Start at 0 (zerobased) the
     *         first frame is 00:00:00:00. * If Timecode source (TimecodeSource) is set to Embedded (embedded), the
     *         first frame is the timecode value on the first input frame of the input.
     */

    public String getAnchor() {
        return this.anchor;
    }

    /**
     * If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify a
     * timecode that will match the input video frame to the output video frame. Use 24-hour format with frame number,
     * (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for Anchor Timecode
     * varies depending on your setting for Timecode source (TimecodeSource). * If Timecode source (TimecodeSource) is
     * set to Specified Start (specifiedstart), the first input frame is the specified value in Start Timecode (Start).
     * Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate output timecode. * If Timecode source
     * (TimecodeSource) is set to Start at 0 (zerobased) the first frame is 00:00:00:00. * If Timecode source
     * (TimecodeSource) is set to Embedded (embedded), the first frame is the timecode value on the first input frame of
     * the input.
     * 
     * @param anchor
     *        If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify
     *        a timecode that will match the input video frame to the output video frame. Use 24-hour format with frame
     *        number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for
     *        Anchor Timecode varies depending on your setting for Timecode source (TimecodeSource). * If Timecode
     *        source (TimecodeSource) is set to Specified Start (specifiedstart), the first input frame is the specified
     *        value in Start Timecode (Start). Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate
     *        output timecode. * If Timecode source (TimecodeSource) is set to Start at 0 (zerobased) the first frame is
     *        00:00:00:00. * If Timecode source (TimecodeSource) is set to Embedded (embedded), the first frame is the
     *        timecode value on the first input frame of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimecodeConfig withAnchor(String anchor) {
        setAnchor(anchor);
        return this;
    }

    /**
     * @param source
     * @see TimecodeSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return
     * @see TimecodeSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeSource
     */

    public TimecodeConfig withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimecodeSource
     */

    public TimecodeConfig withSource(TimecodeSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * Only use when you set Timecode Source (TimecodeSource) to Specified Start (SPECIFIEDSTART). Use Start timecode
     * (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     * 
     * @param start
     *        Only use when you set Timecode Source (TimecodeSource) to Specified Start (SPECIFIEDSTART). Use Start
     *        timecode (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number,
     *        (HH:MM:SS:FF) or (HH:MM:SS;FF).
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Only use when you set Timecode Source (TimecodeSource) to Specified Start (SPECIFIEDSTART). Use Start timecode
     * (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     * 
     * @return Only use when you set Timecode Source (TimecodeSource) to Specified Start (SPECIFIEDSTART). Use Start
     *         timecode (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number,
     *         (HH:MM:SS:FF) or (HH:MM:SS;FF).
     */

    public String getStart() {
        return this.start;
    }

    /**
     * Only use when you set Timecode Source (TimecodeSource) to Specified Start (SPECIFIEDSTART). Use Start timecode
     * (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or
     * (HH:MM:SS;FF).
     * 
     * @param start
     *        Only use when you set Timecode Source (TimecodeSource) to Specified Start (SPECIFIEDSTART). Use Start
     *        timecode (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number,
     *        (HH:MM:SS:FF) or (HH:MM:SS;FF).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimecodeConfig withStart(String start) {
        setStart(start);
        return this;
    }

    /**
     * Only applies to outputs that support program-date-time stamp. Use Time stamp offset (TimestampOffset) to
     * overwrite the timecode date without affecting the time and frame number. Provide the new date as a string in the
     * format "yyyy-mm-dd". To use Time stamp offset, you must also enable Insert program-date-time
     * (InsertProgramDateTime) in the output settings.
     * 
     * @param timestampOffset
     *        Only applies to outputs that support program-date-time stamp. Use Time stamp offset (TimestampOffset) to
     *        overwrite the timecode date without affecting the time and frame number. Provide the new date as a string
     *        in the format "yyyy-mm-dd". To use Time stamp offset, you must also enable Insert program-date-time
     *        (InsertProgramDateTime) in the output settings.
     */

    public void setTimestampOffset(String timestampOffset) {
        this.timestampOffset = timestampOffset;
    }

    /**
     * Only applies to outputs that support program-date-time stamp. Use Time stamp offset (TimestampOffset) to
     * overwrite the timecode date without affecting the time and frame number. Provide the new date as a string in the
     * format "yyyy-mm-dd". To use Time stamp offset, you must also enable Insert program-date-time
     * (InsertProgramDateTime) in the output settings.
     * 
     * @return Only applies to outputs that support program-date-time stamp. Use Time stamp offset (TimestampOffset) to
     *         overwrite the timecode date without affecting the time and frame number. Provide the new date as a string
     *         in the format "yyyy-mm-dd". To use Time stamp offset, you must also enable Insert program-date-time
     *         (InsertProgramDateTime) in the output settings.
     */

    public String getTimestampOffset() {
        return this.timestampOffset;
    }

    /**
     * Only applies to outputs that support program-date-time stamp. Use Time stamp offset (TimestampOffset) to
     * overwrite the timecode date without affecting the time and frame number. Provide the new date as a string in the
     * format "yyyy-mm-dd". To use Time stamp offset, you must also enable Insert program-date-time
     * (InsertProgramDateTime) in the output settings.
     * 
     * @param timestampOffset
     *        Only applies to outputs that support program-date-time stamp. Use Time stamp offset (TimestampOffset) to
     *        overwrite the timecode date without affecting the time and frame number. Provide the new date as a string
     *        in the format "yyyy-mm-dd". To use Time stamp offset, you must also enable Insert program-date-time
     *        (InsertProgramDateTime) in the output settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimecodeConfig withTimestampOffset(String timestampOffset) {
        setTimestampOffset(timestampOffset);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAnchor() != null)
            sb.append("Anchor: ").append(getAnchor()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getTimestampOffset() != null)
            sb.append("TimestampOffset: ").append(getTimestampOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimecodeConfig == false)
            return false;
        TimecodeConfig other = (TimecodeConfig) obj;
        if (other.getAnchor() == null ^ this.getAnchor() == null)
            return false;
        if (other.getAnchor() != null && other.getAnchor().equals(this.getAnchor()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getTimestampOffset() == null ^ this.getTimestampOffset() == null)
            return false;
        if (other.getTimestampOffset() != null && other.getTimestampOffset().equals(this.getTimestampOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnchor() == null) ? 0 : getAnchor().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getTimestampOffset() == null) ? 0 : getTimestampOffset().hashCode());
        return hashCode;
    }

    @Override
    public TimecodeConfig clone() {
        try {
            return (TimecodeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.TimecodeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}