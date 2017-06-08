/*
 * BSD 3-Clause License
 *
 * Copyright (c) 2017, Tikal Knowledge, Ltd.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.tikalk.worktracker.time.model;

import com.activeandroid.annotation.Table;
import com.tikalk.worktracker.model.ProjectTask;
import com.tikalk.worktracker.model.ReportTimePeriod;
import com.tikalk.worktracker.model.TikalEntity;
import com.tikalk.worktracker.model.User;

import java.util.Date;

/**
 * Report filter entity.
 *
 * @author Moshe Waisberg.
 */
@Table(name = "ReportFilter")
public class ReportFilter extends TikalEntity {

    private User user;
    private ProjectTask task;
    private int period = ReportTimePeriod.THIS_MONTH.ordinal();
    private Date start;
    private Date finish;
    private String favorite;
    private boolean showProjectField;
    private boolean showTaskField;
    private boolean showStartField;
    private boolean showFinishField;
    private boolean showDurationField;
    private boolean showNotesField;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProjectTask getTask() {
        return task;
    }

    public void setTask(ProjectTask task) {
        this.task = task;
    }

    public ReportTimePeriod getPeriod() {
        return ReportTimePeriod.values()[period];
    }

    public void setPeriod(ReportTimePeriod period) {
        this.period = period.ordinal();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public boolean isShowProjectField() {
        return showProjectField;
    }

    public void setShowProjectField(boolean showProjectField) {
        this.showProjectField = showProjectField;
    }

    public boolean isShowTaskField() {
        return showTaskField;
    }

    public void setShowTaskField(boolean showTaskField) {
        this.showTaskField = showTaskField;
    }

    public boolean isShowStartField() {
        return showStartField;
    }

    public void setShowStartField(boolean showStartField) {
        this.showStartField = showStartField;
    }

    public boolean isShowFinishField() {
        return showFinishField;
    }

    public void setShowFinishField(boolean showFinishField) {
        this.showFinishField = showFinishField;
    }

    public boolean isShowDurationField() {
        return showDurationField;
    }

    public void setShowDurationField(boolean showDurationField) {
        this.showDurationField = showDurationField;
    }

    public boolean isShowNotesField() {
        return showNotesField;
    }

    public void setShowNotesField(boolean showNotesField) {
        this.showNotesField = showNotesField;
    }

    public boolean getShowProjectField() {
        return this.showProjectField;
    }

    public boolean getShowTaskField() {
        return this.showTaskField;
    }

    public boolean getShowStartField() {
        return this.showStartField;
    }

    public boolean getShowFinishField() {
        return this.showFinishField;
    }

    public boolean getShowDurationField() {
        return this.showDurationField;
    }

    public boolean getShowNotesField() {
        return this.showNotesField;
    }
}
