package com.danir.lazylayout.data

import com.danir.lazylayout.R
import com.danir.lazylayout.model.Brand
import com.danir.lazylayout.model.Product
import com.danir.lazylayout.model.Store

object DummyData {
    val MonitorBrand = listOf(
        Brand(
            id = 1,
            name = "Lenovo",
            nickname = "@lenovo.id",
            contact = "WhatsApp : +6221 50851766",
            photo = R.drawable.lenovo,
            description = "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."
        ),
        Brand(
            id = 2,
            name = "ViewSonic",
            nickname = "@viewsonic.id",
            contact = "Call Center : 021-3456 650",
            photo = R.drawable.viewsonic,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 3,
            name = "AOC",
            nickname = "@aoc.id",
            contact = "Telepon. 1500155",
            photo = R.drawable.aoc,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 4,
            name = "Gigabyte",
            nickname = "@gigabyte.id",
            contact = "Telepon: +6221 6333767",
            photo = R.drawable.gigabyte,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 5,
            name = "Acer",
            nickname = "@acer.id",
            contact = "Telepon: 1-500-155",
            photo = R.drawable.acer,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 6,
            name = "Asus",
            nickname = "@asus.id",
            contact = "Telepon: 1500 128",
            photo = R.drawable.asus,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 7,
            name = "LG",
            nickname = "@lg.id",
            contact = "Telepon: +62811 88 14010",
            photo = R.drawable.lg,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 8,
            name = "Koorui",
            nickname = "@ipason.id",
            contact = "Admin: 087716060063",
            photo = R.drawable.koorui,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 9,
            name = "MSI",
            nickname = "@msi.id",
            contact = "Whatsapp : 0812 8027 2801",
            photo = R.drawable.msi,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
        Brand(
            id = 10,
            name = "Samsung",
            nickname = "@samsung.id",
            contact = "Call Center: 0800-1128888",
            photo = R.drawable.samsung,
            description = "Monitors for every budget\n" +
                    "\n" +
                    "Do you need a large, crisp image when working at your computer? Are you worried about the sticker shock that usually comes with high quality monitors? Those days are over. At Lenovo, we've worked hard to design monitors that fit your budget and provide the premium viewing experience you deserve. No more grainy, low color-quality screens. We have a large selection so you can find the perfect monitor for your needs."

        ),
    )

    val MonitorStore = listOf(
        Store(
            id = 1,
            name = "Sinar Jaya",
            photo = R.drawable.sinarjaya,
            location = "Jakarta Pusat",
            status = "Aktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 2,
            name = "Makmur Indah",
            photo = R.drawable.olshop9,
            location = "Jakarta Timur",
            status = "Nonaktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 3,
            name = "Musang Queen",
            photo = R.drawable.olshop3,
            location = "Kalimantan Utara",
            status = "Aktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 4,
            name = "Boyo Eling",
            photo = R.drawable.olshop11,
            location = "Jawa Tengah",
            status = "Aktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 5,
            name = "Gold King Sejahtra",
            photo = R.drawable.olshop12,
            location = "Banten",
            status = "Aktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 6,
            name = "Cerah Nusa",
            photo = R.drawable.olshop6,
            location = "Sumatra Barat",
            status = "Nonaktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 7,
            name = "Jogjagadget",
            photo = R.drawable.olshop7,
            location = "D I Yogyakarta",
            status = "Aktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 8,
            name = "Mang Asep Store",
            photo = R.drawable.olshop8,
            location = "Jawa Barat",
            status = "Aktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 9,
            name = "Arctronic",
            photo = R.drawable.olshop9,
            location = "Aceh",
            status = "Aktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        ),
        Store(
            id = 10,
            name = "GadgetPro",
            photo = R.drawable.olshop10,
            location = "Jakarta Timur",
            status = "Nonaktif",
            description = "Kami sangat peduli terhadap kepuasan pelanggan, itulah mengapa kami berkomitmen untuk menyediakan layanan pelanggan yang luar biasa. Tim kami siap membantu Anda dengan pertanyaan, masukan, atau bantuan apa pun yang Anda butuhkan selama proses pembelian.\n" +
                    "\n" +
                    "Nikmati kemudahan berbelanja online dengan pengiriman yang cepat dan aman langsung ke pintu Anda. Berbelanja di Kami adalah pengalaman yang mudah, cepat, dan menyenangkan.\n" +
                    "\n" +
                    "Terima kasih telah memilih toko kami sebagai mitra belanja online Anda"
        )
    )

    val MonitorProduct = listOf(
        Product(
            id = 1,
            name = "Lenovo R25i-30",
            price = "Rp. 2.699.000",
            photo = R.drawable.r25i30,
            specs = "Display Size 24.5\"\n" +
                    "View Area 543.7x302.6 mm\n" +
                    "Panel In-Plane Switching\n" +
                    "Backlight WLED\n" +
                    "Aspect Ratio 16:9\n" +
                    "Resolution 1920x1080\n" +
                    "Pixel Pitch 0.283×0.280 mm\n" +
                    "Dot / Pixel Per Inch 90 dpi\n" +
                    "View Angle (H / V) 178° / 178°\n" +
                    "Response Time 0.5ms (MPRT) / 1ms (Level 5) / 2ms (Level 4) / 3ms (Level 3) / 4ms (Level 2) / 5ms (Level 1)\n" +
                    "Color Support 16.7 Million\n" +
                    "Refresh Rate 165Hz (Overclock to 180Hz)\n" +
                    "Brightness 400 cd/m²\n" +
                    "Contrast Ratio 1000:1\n" +
                    "Color Gamut 99% sRGB, 90% DCI-P3\n" +
                    "Screen Surface Treatment Anti-glare\n" +
                    "Curvature None\n" +
                    "Camera None\n" +
                    "Microphone None\n" +
                    "Speakers 3Wx2\n" +
                    "Power Consumption (Typical / Maximum) 18.5W / 28W\n" +
                    "Power Adapter Integrated\n" +
                    "Touchscreen None\n" +
                    "Smart System None"
        ),
        Product(
            id = 2,
            name = "ViewSonic VA2432H",
            price = "Rp. 1.399.000",
            photo = R.drawable.va2432h,
            specs = "Display Size (in.): 24\n" +
                    "Viewable Area (in.): 23.8\n" +
                    "Panel Type: IPS Technology\n" +
                    "Resolution: 1920 x 1080\n" +
                    "Resolution Type: FHD\n" +
                    "Static Contrast Ratio: 1,000:1 (typ)\n" +
                    "Dynamic Contrast Ratio: 50M:1\n" +
                    "Light Source: LED\n" +
                    "Brightness: 250 cd/m² (typ)\n" +
                    "Colors: 16.7M\n" +
                    "Color Space Support: 8 bit (6 bit + Hi-FRC)\n" +
                    "Aspect Ratio: 16:9\n" +
                    "Response Time (Typical GTG): 1ms\n" +
                    "Viewing Angles: 178º horizontal, 178º vertical\n" +
                    "Backlight Life (Hours): 30000 Hrs (Min)\n" +
                    "Curvature: Flat\n" +
                    "Refresh Rate (Hz): 100 "
        ),
        Product(
            id = 3,
            name = "AOC 24G2SPU",
            price = "Rp. 2.399.000",
            photo = R.drawable.g24spu,
            specs = "Screen\n" +
                    "Resolution : 1920x1080\n" +
                    "Refresh rate : 165Hz\n" +
                    "Screen size (inch) : 23.8 inch\n" +
                    "Screen size (cm) : 60.5 cm\n" +
                    "Flat / Curved : Flat\n" +
                    "Backlight : WLED\n" +
                    "Panel Type : IPS\n" +
                    "Aspect ratio : 16:9\n" +
                    "Display Colours : 16.7 Million\n" +
                    "sRGB Coverage (%) (CIE 1931) : 126\n" +
                    "Adobe RGB Coverage (%) (CIE 1931) : 89\n" +
                    "DCI-P3 (%) (CIE 1931) : 89\n" +
                    "NTSC (%) (CIE 1976) : 96\n" +
                    "Pixels per Inch : 93\n" +
                    "Scanning Frequency VGA/HDMI1.4 : 30 -160KHz (H) DP1.2 : 30 -200KHz (H) VGA/HDMI1.4 :48-144Hz (V)\n" +
                    "DP1.2:48-165Hz (V)\n" +
                    "Response time (GtG) : 4 ms\n" +
                    "Response Time (MPRT) : 1 ms\n" +
                    "Contrast (static) : 1000:1\n" +
                    "Brightness (typical) : 300 cd/m²\n" +
                    "Dinamic Contrast Ratio : 80M:1\n" +
                    "Viewing angle (CR10) : 178/178 º"
        ),
        Product(
            id = 4,
            name = "Gigabyte G24F",
            price = "Rp. 2.299.000",
            photo = R.drawable.g24f,
            specs = "Type : Flat\n" +
                    "Panel Size (diagonal) 23.8\" SS IPS\n" +
                    "Display Viewing Area (HxV) 527.04*296.46 (mm)\n" +
                    "Panel Backlight/ Type Edge type\n" +
                    "Display Surface(non-glare/ glare) Non-glare type\n" +
                    "Color Saturation 90% DCI-P3/120% sRGB\n" +
                    "True Resolution 1920 x 1080 (FHD)\n" +
                    "Pixel Pitch 0.2745 (H) x 0.2745 (V) (mm)\n" +
                    "Brightness 300 cd/m2 (TYP)\n" +
                    "Contrast Ratio 1000 : 1\n" +
                    "Viewing Angle 178°(H)/178°(V)\n" +
                    "Display Colors 8 bits\n" +
                    "Response Time 1ms (MPRT) / 2ms (GTG)\n" +
                    "Refresh Rate 165Hz/OC 170Hz\n" +
                    "Flicker-free Yes\n" +
                    "Signal Input HDMI 2.0 x2, Display port 1.2 x1 (capable for HDR)\n" +
                    "Earphone Jack Yes\n" +
                    "Speaker N/A\n"

        ),
        Product(
            id = 5,
            name = "Acer K243YE",
            price = "Rp. 1.399.000",
            photo = R.drawable.k243y,
            specs = "Garansi Resmi 3 Tahun\n" +
                    "Brand Type : K243Y E\n" +
                    "Panel Size(Inch) : 24\"\n" +
                    "Panel Type : IPS\n" +
                    "Panel Resolution : 1920 x 1080\n" +
                    "Brightness (cd/㎡) : 250\n" +
                    "Refresh Rate(hz) : 100\n" +
                    "Response Time : 1\n" +
                    "Sync : AMD FreeSync™\n" +
                    "Connectivity : HDMI 1.4 x1 + D-Sub x1\n" +
                    "Audio port : Audio Out 3.5 mm x 1\n" +
                    "Build in Speaker : Yes\n" +
                    "VESA mounting (mm) : 100 x 100\n" +
                    "Ergonomic : Yes\n"
        ),
        Product(
            id = 6,
                name = "Asus VA24EHF",
            price = "Rp. 1.549.000",
            photo = R.drawable.va24ehf,
            specs = "Brand Type : Asus VA24EHF | VZ24EHF\n" +
                    "Panel Size(Inch) : 24 Inch\n" +
                    "Panel Type : IPS Flat\n" +
                    "Panel Resolution : 1920 x 1080 (Full HD)\n" +
                    "Aspect Ratio : 16:9 Wide\n" +
                    "Brightness (cd/㎡) : 250\n" +
                    "Refresh Rate(hz) : 100\n" +
                    "Response Time (ms) : 1\n" +
                    "Sync : Adaptive-sync\n" +
                    "Connectivity : HDMI 1.4 x1\n" +
                    "Speaker : No\n" +
                    "Audio port : -\n" +
                    "VESA mounting (mm) : 100 x 100 | 75 x 75\n" +
                    "Ergonomic Stand : No\n" +
                    "Panel bit : 8 bits (6 bits + FRC)\n" +
                    "HDR : -\n" +
                    "NTSC (%) : -\n" +
                    "SRGB (%) : -\n" +
                    "Adobe RGB (%) : -\n" +
                    "DCI-P3 (%) : -\n" +
                    "Power Cons (watt) : 12.02 | 19\n" +
                    "Product Weight (nw/kg) : 2.84 | 2.85\n" +
                    "Box Dimension (cm) : 60 x 44 x 12.5 | 60 x 38.5 x 12\n" +
                    "Volume Weight (kg) : 6 | 5\n" +
                    "Include :\n" +
                    "Power Cable\n" +
                    "HDMI Cable"
        ),
        Product(
            id = 7,
            name = "LG 42C3",
            price = "Rp. 13.499.000",
            photo = R.drawable.lg42c3,
            specs = "SPESIFIKASI\n" +
                    "DISPLAY & PICTURE QUALITY\n" +
                    "Screen Type : OLED\n" +
                    "Screen size : 42\"\n" +
                    "Resolution : 3840 x 2160\n" +
                    "Motion Rate : Tru Motion 200 (120Hz)\n" +
                    "Wide Colour Gamut : Yes (OLED Colour)\n" +
                    "Perfect Black : Yes\n" +
                    "Colour Bit Depth :10-bit Processing\n" +
                    "HDR Format11 : Dolby VisionTM, HDR10, HLG\n" +
                    "Dolby Vision IQ™1 : Yes\n" +
                    "HDR10 Pro1 : Yes\n" +
                    "Dynamic Tone Mapping : Yes (PRO)\n" +
                    "Picture Modes : 10 (Vivid, Standard, FILMMAKER MODE™, APS, Cinema, Cricket, Game Optimiser, ISF Bright Room, ISF Dark Room, Personalised Picture Wizard)\n" +
                    "HDR Picture Modes : 6 (Vivid, Standard, FILMMAKER MODE™, Cinema Home, Cinema, Game Optimiser)\n" +
                    "Dolby Vision ™ Picture Modes : 5 (Vivid, Standard, Cinema Home, Cinema, Game Optimiser)\n" +
                    "Image Processor : α9 AI Processor 4K Gen 6\n" +
                    "Resolution Upscaling2 : AI Super Upscaling 4K\n" +
                    "AI Picture : Yes (PRO)\n" +
                    "AI Brightness : Yes (HDR)\n" +
                    "Auto Genre Selection : Yes (SDR/HDR/Dolby Vision)\n" +
                    "FILMMAKER MODE™ : Yes\n" +
                    "Motion Pro (Black Frame Insertion) : OLED Motion\n" +
                    "Noise Reduction : Yes\n" +
                    "Tuner : MPEG-2/4 DVB-T2"
        ),
        Product(
            id = 8,
            name = "Koorui 24E3",
            price = "Rp. 1.599.000",
            photo = R.drawable.k24e3,
            specs = "Screen size :23.8 inches\n" +
                    "Resolution :1920 x 1080 FHD\n" +
                    "screen type: IPS\n" +
                    "Refresh rate: 165 Hz\n" +
                    "Gross weight（KG）:4.49\n" +
                    "Net weight (KG): 3.06\n" +
                    "Interface:\n" +
                    "HDMI *2----1080P+144HZ\n" +
                    "DP *1----1080P+165HZ\n" +
                    "Sound interface*1\n" +
                    "SRGB: 99%\n" +
                    "Adobe RGB: NA\n" +
                    "NTSC: 72%\n" +
                    "Static contrast : 1000：1\n" +
                    "Color contrast : 20000000：1\n" +
                    "Brightness（CD/M2）: 250\n" +
                    "Maximum: 16.7M\n" +
                    "Response time: 1ms MPRT\n" +
                    "Gaming mode:OD/ FreeSync/G-sync/Star sight/Timer"
        ),
        Product(
            id = 9,
            name = "MSI G272QPF",
            price = "Rp. 3.425.000",
            photo = R.drawable.g272qpf,
            specs = "SPECIFICATIONS\n" +
                    "Panel Size 27\" (69cm)\n" +
                    "Active Display Area (mm) 596.736(H)x335.664(V)\n" +
                    "Curvature Flat\n" +
                    "Panel Type Rapid IPS\n" +
                    "Panel Resolution 2560x1440 (WQHD)\n" +
                    "Pixel Pitch (H x V) 0.2331(H)x0.2331(V)\n" +
                    "Aspect Ratio 16:9\n" +
                    "Brightness (nits) 300 (Typ.)\n" +
                    "Contrast Ratio 1000:1\n" +
                    "DCR 100000000:1\n" +
                    "Signal Frequency 78.2~268.8 KHz(H) / 48~165 Hz(V)\n" +
                    "Refresh Rate 170Hz\n" +
                    "Response time 1ms GtG\n" +
                    "DYNAMIC REFRESH RATE\n" +
                    "TECHNOLOGY G-SYNC Compatible\n" +
                    "HDR Support HDR Ready\n" +
                    "Video ports\n" +
                    "2x HDMI™ (Supports WQHD@144Hz as\n" +
                    "specified in HDMI™ 2.0b)\n" +
                    "1x DisplayPort (Supports WQHD@170Hz as\n" +
                    "specified in DisplayPort 1.2a By DP\n" +
                    "overclocking)\n" +
                    "USB ports N/A\n" +
                    "Audio ports 1x Headphone out\n" +
                    "Viewing Angle 178° (H) / 178° (V)\n" +
                    "Adobe RGB / DCI-P3 / sRGB 91.18% / 92.83% / 120.22%\n" +
                    "Surface Treatment Anti-glare\n" +
                    "Display Colors 1.07B (8 bits + FRC)\n" +
                    "Power Type External Adaptor 20V 2.25A\n" +
                    "Power Input 100~240V, 50/60Hz"
        ),
        Product(
            id = 10,
            name = "Samsung Odyssey G65B",
            price = "Rp. 7.679.000",
            photo = R.drawable.g65b,
            specs = "Brand Type : Samsung Odyssey G6 LS27BG652\n" +
                    "Panel Size(Inch) : 27\"\n" +
                    "Panel Type : VA Curved 1000R\n" +
                    "Panel Resolution : 2560 x 1440\n" +
                    "Aspect Ratio : 16:9 Wide\n" +
                    "Brightness (cd/㎡) : 350\n" +
                    "Refresh Rate(hz) : 240\n" +
                    "Response Time (ms) : 1\n" +
                    "Sync : AMD FreeSync™\n" +
                    "Connectivity : HDMI 2.1 x2 + DP 1.4 x1 + USB 3.0 x2 + RJ45 x1\n" +
                    "Speaker : Yes\n" +
                    "Audio port : 1 x 3.5mm Audio Out\n" +
                    "VESA mounting (mm) : 100x100\n" +
                    "Ergonomic Stand : Yes\n" +
                    "Panel bit : 10 bits (8 bits + FRC)\n" +
                    "HDR : HDR600\n" +
                    "NTSC (%) : -\n" +
                    "SRGB (%) : -\n" +
                    "Adobe RGB (%) : -\n" +
                    "DCI-P3 (%) : 95"
        ),
    )
}