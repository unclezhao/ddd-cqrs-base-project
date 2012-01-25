package com.librarymanagement.application.commands;

import com.librarymanagement.domain.BookId;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.nthdimenzion.cqrs.command.ICommand;
import org.nthdimenzion.cqrs.command.annotations.Command;
import org.springframework.util.ObjectUtils;

import java.util.Set;

@Command
public class IssueBooksCommand implements ICommand {

    public final Set<BookId> bookIds;
    public final Long memberId;

    public IssueBooksCommand( Set<BookId> bookIds, Long memberId) {
        this.bookIds = bookIds;
        this.memberId = memberId;
    }


}