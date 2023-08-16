package com.codestates.server.question.mapper;

import com.codestates.server.question.dto.QuestionPatchDto;
import com.codestates.server.question.dto.QuestionResponseDto;
import com.codestates.server.question.entity.Question;
import com.codestates.server.question.entity.QuestionTag;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T13:16:53+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Azul Systems, Inc.)"
)
@Component
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public Question questionPatchDtoToQuestion(QuestionPatchDto questionPatchDto) {
        if ( questionPatchDto == null ) {
            return null;
        }

        Question question = new Question();

        question.setQuestionId( questionPatchDto.getQuestionId() );
        question.setTitle( questionPatchDto.getTitle() );
        question.setContent( questionPatchDto.getContent() );

        return question;
    }

    @Override
    public QuestionResponseDto questionToQuestionResponseDto(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionResponseDto questionResponseDto = new QuestionResponseDto();

        questionResponseDto.setQuestionId( question.getQuestionId() );
        questionResponseDto.setTitle( question.getTitle() );
        questionResponseDto.setContent( question.getContent() );
        questionResponseDto.setViews( question.getViews() );
        List<QuestionTag> list = question.getQuestionTags();
        if ( list != null ) {
            questionResponseDto.setQuestionTags( new ArrayList<QuestionTag>( list ) );
        }
        questionResponseDto.setModified_At( question.getModified_At() );

        return questionResponseDto;
    }
}
