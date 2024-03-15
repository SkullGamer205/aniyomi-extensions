package eu.kanade.tachiyomi.animeextension.ru.anilibme

import eu.kanade.tachiyomi.animesource.model.AnimeFilterList
import eu.kanade.tachiyomi.animesource.model.SAnime
import eu.kanade.tachiyomi.animesource.model.SEpisode
import eu.kanade.tachiyomi.animesource.model.Video
import eu.kanade.tachiyomi.animesource.online.ParsedAnimeHttpSource
import okhttp3.Request
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

class AniLibme: ParsedAnimeHttpSource() {

    override val name = "AniLib.me"

    override val baseUrl = "https://anilib.me/"

    override val lang = "ru"

    override val supportsLatest = false

    // ============================== Popular ===============================
    override fun popularAnimeFromElement(element: Element): SAnime {
        TODO("Not yet implemented")
    }

    override fun popularAnimeNextPageSelector(): String? {
        TODO("Not yet implemented")
    }

    override fun popularAnimeRequest(page: Int): Request {
        TODO("Not yet implemented")
    }

    override fun popularAnimeSelector(): String {
        TODO("Not yet implemented")
    }

    // ============================== Episodes ==============================
    override fun episodeFromElement(element: Element): SEpisode {
        TODO("Not yet implemented")
    }

    override fun episodeListSelector(): String {
        TODO("Not yet implemented")
    }

    // =========================== Anime Details ============================
    override fun animeDetailsParse(document: Document): SAnime {
        TODO("Not yet implemented")
    }

    // ============================ Video Links =============================
    override fun videoFromElement(element: Element): Video {
        TODO("Not yet implemented")
    }

    override fun videoListSelector(): String {
        TODO("Not yet implemented")
    }

    override fun videoUrlParse(document: Document): String {
        TODO("Not yet implemented")
    }

    // =============================== Search ===============================
    override fun searchAnimeFromElement(element: Element): SAnime {
        TODO("Not yet implemented")
    }

    override fun searchAnimeNextPageSelector(): String? {
        TODO("Not yet implemented")
    }

    override fun searchAnimeRequest(page: Int, query: String, filters: AnimeFilterList): Request {
        TODO("Not yet implemented")
    }

    override fun searchAnimeSelector(): String {
        TODO("Not yet implemented")
    }

    // =============================== Latest ===============================
    override fun latestUpdatesFromElement(element: Element): SAnime {
        TODO("Not yet implemented")
    }

    override fun latestUpdatesNextPageSelector(): String? {
        TODO("Not yet implemented")
    }

    override fun latestUpdatesRequest(page: Int): Request {
        TODO("Not yet implemented")
    }

    override fun latestUpdatesSelector(): String {
        TODO("Not yet implemented")
    }

    companion object {
        const val PREFIX_SEARCH = "id:"
    }
}
