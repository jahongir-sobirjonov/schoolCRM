package uniqueproject.uz.schoolcrm.controller;

import org.springframework.web.bind.annotation.*;
import uniqueproject.uz.schoolcrm.entity.Lesson;

import java.util.List;

@RestController
@RequestMapping("/lessons")
public class LessonController {
    private final LessonService lessonService;

    @GetMapping
    public List<Lesson> getAllLessons() {
        return lessonService.getAllLessons();
    }

    @GetMapping("/{id}")
    public Lesson getLessonById(@PathVariable Long id) {
        return lessonService.getLessonById(id);
    }

    @PostMapping
    public Lesson createLesson(@RequestBody Lesson lesson) {
        return lessonService.createLesson(lesson);
    }
}

