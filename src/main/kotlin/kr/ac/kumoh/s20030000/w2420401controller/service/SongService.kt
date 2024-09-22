package kr.ac.kumoh.s20030000.w2420401controller.service

import kr.ac.kumoh.s20030000.w2420401controller.model.Song
import kr.ac.kumoh.s20030000.w2420401controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }
}