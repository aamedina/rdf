(ns net.wikipunk.rdf.exif
  {:dc11/description
   #{{:rdf/language "fr",
      :rdf/value
      "Vocabulaire pour décrire les données Exif d'une photographie. Toutes les balises Exif 2.2 sont définies comme des propriétés RDF, ainsi que plusieurs termes pour donner de l'aide."}
     {:rdf/language "ja",
      :rdf/value
      "Exifフォーマットの写真からデータを取りだしてRDFで表現するため、Exif 2.2の全てのタグをRDFプロパティとして定義し、さらにそれを記述するのに必要な語彙を追加したボキャブラリ"}
     {:rdf/language "en",
      :rdf/value
      "Vocabulary to describe an Exif format picture data. All Exif 2.2 tags are defined as RDF properties, as well as several terms to help this schema."}},
   :dc11/source {:xsd/anyURI "http://tsc.jeita.or.jp/avs/data/cp3451.pdf"},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Exif data description vocabulary"},
   :dcat/downloadURL "net/wikipunk/ext/exif.rdf",
   :dcterms/created {:rdf/language "en",
                     :rdf/value    "2003-07-18"},
   :dcterms/modified {:rdf/language "en",
                      :rdf/value    "2003-08-19"},
   :foaf/maker {:xsd/anyURI "urn:pin:MK705"},
   :namespaces {"dc11"    "http://purl.org/dc/elements/1.1/",
                "dcterms" "http://purl.org/dc/terms/",
                "ex"      "http://example.org/",
                "exif"    "http://www.w3.org/2003/12/exif/ns#",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Experimental version."},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "exif",
   :rdfa/uri "http://www.w3.org/2003/12/exif/ns#",
   :xsd/anyURI "http://www.w3.org/2003/12/exif/ns"})

(def IFD
  {:db/ident     :exif/IFD,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An Image File Directory"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "IFD"}})

(def _unknown
  {:db/ident     :exif/_unknown,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An Exif tag whose meaning is not known"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Unknown tag"}})

(def apertureValue
  {:db/ident :exif/apertureValue,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37378"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value
      "レンズ絞り値（APEX値）。この値のルート2のベキ乗を取ると、通常の絞り値となる。例えば'5'の場合だと√2^5=F5.6"}
     {:rdf/language "en",
      :rdf/value    "The lens aperture. The unit is the APEX value."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ApertureValue"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def artist
  {:db/ident           :exif/artist,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "315"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Person who created the image"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Artist"},
   :rdfs/subPropertyOf #{:dc11/creator :exif/exifAttribute}})

(def bitsPerSample
  {:db/ident :exif/bitsPerSample,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "258"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BitsPerSample"},
   :rdfs/subPropertyOf #{:exif/imageDataStruct :exif/resolution}})

(def brightnessValue
  {:db/ident :exif/brightnessValue,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37379"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value
      "画像撮影時の撮影対象物の明るさ（APEX値）。EVにするにはISO感度の値を足す必要があり、Ev:Exposure, Bv:BrightnessValue, Sv:SensitivityValueとしてEv=Bv+Sv Sv=log^2(ISOSpeedRating/3.125)という計算式を使う。ISO感度100の場合Sv=5、ISO200の場合Sv=6、ISO125ではSv=5.32"}
     {:rdf/language "en",
      :rdf/value
      "The value of brightness. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99. Note that if the numerator of the recorded value is FFFFFFFF.H, Unknown shall be indicated."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BrightnessValue"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def cfaPattern
  {:db/ident :exif/cfaPattern,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41730"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value
      "CCDに付いているColor filter array(CFA)のパターン。例えば普通のRGBフィルターだと、CFAPatternのデータは 02 02 00 01 01 02"}
     {:rdf/language "en",
      :rdf/value
      "The color filter array (CFA) geometric pattern of the image sensor when a one-chip color area sensor is used. It does not apply to all sensing methods."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CFAPattern"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def colorSpace
  {:db/ident :exif/colorSpace,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "40961"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "使われる色空間。通常sRGB"}
     {:rdf/language "en",
      :rdf/value
      "The color space information tag (ColorSpace) is always recorded as the color space specifier. Normally sRGB (=1) is used to define the color space based on the PC monitor conditions and environment."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ColorSpace"},
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def componentsConfiguration
  {:db/ident :exif/componentsConfiguration,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37121"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Information specific to compressed data. The channels of each component are arranged in order from the 1st component to the 4th. For uncompressed data the data arrangement is given in the PhotometricInterpretation tag. However, since PhotometricInterpretation can only express the order of Y,Cb and Cr, this tag is provided for cases when compressed data uses components other than Y, Cb, and Cr and to enable support of other sequences."}
     {:rdf/language "ja",
      :rdf/value
      "圧縮データがYCC以外の並びの場合、4バイトでその並びを示す。それぞれの値は0:not exist,1:Y,2:Cb,3:Cr,4:R,5:G,6:B"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ComponentsConfiguration"},
   :rdfs/subPropertyOf :exif/imageConfig})

(def compressedBitsPerPixel
  {:db/ident :exif/compressedBitsPerPixel,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37122"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "画像の圧縮率"}
     {:rdf/language "en",
      :rdf/value
      "Information specific to compressed data. The compression mode used for a compressed image is indicated in unit bits per pixel."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CompressedBitsPerPixel"},
   :rdfs/subPropertyOf :exif/imageConfig})

(def compression
  {:db/ident :exif/compression,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "259"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compression"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def contrast
  {:db/ident :exif/contrast,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41992"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The direction of contrast processing applied by the camera when the image was shot."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contrast"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def copyright
  {:db/ident :exif/copyright,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "33432"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "この画像の撮影者および編集者の著作権情報"}
     {:rdf/language "en",
      :rdf/value
      "Copyright information. In this standard the tag is used to indicate both the photographer and editor copyrights. It is the copyright notice of the person or organization claiming rights to the image."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright"},
   :rdfs/subPropertyOf #{:exif/exifAttribute :dc11/rights}})

(def customRendered
  {:db/ident :exif/customRendered,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41985"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The use of special processing on image data, such as rendering geared to output. When special processing is performed, the reader is expected to disable or minimize any further processing."}
     {:rdf/language "ja",
      :rdf/value    "特別なレンダリング処理を行っているかどうか"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CustomRendered"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def datatype
  {:db/ident :exif/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The Exif field data type, such as ascii, byte, short etc."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Type"},
   :rdfs/subPropertyOf :dc11/type})

(def date
  {:db/ident :exif/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date"},
   :rdfs/subPropertyOf :dc11/date})

(def dateAndOrTime
  {:db/ident           :exif/dateAndOrTime,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "An attribute relating to Date and/or Time"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Date and/or Time"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def dateTime
  {:db/ident :exif/dateTime,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "306"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The date and time of image creation. In this standard it is the date and time the file was changed."}
     {:rdf/language "ja",
      :rdf/value    "この画像が作成（あるいは最後に変更された）日時。通常はDateTimeOriginaと同じ値"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DateTime"},
   :rdfs/subPropertyOf #{:exif/exifAttribute :exif/date}})

(def dateTimeDigitized
  {:db/ident :exif/dateTimeDigitized,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "36868"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The date and time when the image was stored as digital data. If, for example, an image was captured by DSC and at the same time the file was recorded, then the DateTimeOriginal and DateTimeDigitized will have the same contents."}
     {:rdf/language "ja",
      :rdf/value    "画像がデジタル化された日時。デジカメ画像なら通常DateTimeOriginalと同じ値"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DateTimeDigitized"},
   :rdfs/subPropertyOf #{:exif/date :exif/dateAndOrTime}})

(def dateTimeOriginal
  {:db/ident :exif/dateTimeOriginal,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "36867"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "オリジナル画像が作成（撮影）された日時"}
     {:rdf/language "en",
      :rdf/value
      "The date and time when the original image data was generated. For a DSC the date and time the picture was taken are recorded."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DateTimeOriginal"},
   :rdfs/subPropertyOf #{:exif/date :exif/dateAndOrTime}})

(def deviceSettingDescription
  {:db/ident :exif/deviceSettingDescription,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41995"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DeviceSettingDescription"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def digitalZoomRatio
  {:db/ident :exif/digitalZoomRatio,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41988"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "デジタルズームが使われた場合、その比率"}
     {:rdf/language "en",
      :rdf/value
      "The digital zoom ratio when the image was shot. If the numerator of the recorded value is 0, this indicates that digital zoom was not used."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DigitalZoomRatio"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def exifAttribute
  {:db/ident :exif/exifAttribute,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags."},
   :rdfs/domain :exif/IFD,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exif Attribute"}})

(def exifVersion
  {:db/ident           :exif/exifVersion,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "36864"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "ja",
                          :rdf/value    "Exif形式のバージョン"}
                         {:rdf/language "en",
                          :rdf/value    "Exif Version"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "ExifVersion"},
   :rdfs/subPropertyOf :exif/versionInfo})

(def exif_IFD_Pointer
  {:db/ident :exif/exif_IFD_Pointer,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "34665"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A pointer to the Exif IFD, which is a set of tags for recording Exif-specific attribute information."}
     {:rdf/language "ja",
      :rdf/value    "Exif IFDへのポインタ"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exif IFD Pointer"},
   :rdfs/subPropertyOf :exif/ifdPointer})

(def exifdata
  {:db/ident     :exif/exifdata,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An Exif IFD data entry"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Exif data"}})

(def exposureBiasValue
  {:db/ident :exif/exposureBiasValue,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37380"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The exposure bias. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99."}
     {:rdf/language "ja",
      :rdf/value    "撮影時の露光補正量。単位はAPEX値(EV)"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ExposureBiasValue"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureIndex
  {:db/ident :exif/exposureIndex,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41493"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The exposure index selected on the camera or input device at the time the image is captured."}
     {:rdf/language "ja",
      :rdf/value    "CCD感度。データ形式が符号なし分数である事を除き、ISOSpeedRatingsと同じ"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ExposureIndex"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureMode
  {:db/ident :exif/exposureMode,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41986"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "the exposure mode set when the image was shot. In auto-bracketing mode, the camera shoots a series of frames of the same scene at different exposure settings."}
     {:rdf/language "ja",
      :rdf/value    "露光モード"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ExposureMode"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureProgram
  {:db/ident :exif/exposureProgram,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "34850"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The class of the program used by the camera to set exposure when the picture is taken."}
     {:rdf/language "ja",
      :rdf/value    "露光制御のモード"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ExposureProgram"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureTime
  {:db/ident           :exif/exposureTime,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "33434"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "ja",
                          :rdf/value    "露光時間（シャッター速度の逆数）。単位は秒"}
                         {:rdf/language "en",
                          :rdf/value "Exposure time, given in seconds (sec)."}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "ExposureTime"},
   :rdfs/subPropertyOf #{:exif/pictTaking :exif/seconds}})

(def fNumber
  {:db/ident           :exif/fNumber,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "33437"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "en",
                          :rdf/value    "F number"}
                         {:rdf/language "ja",
                          :rdf/value    "レンズのF値"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "FNumber"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def fileSource
  {:db/ident :exif/fileSource,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41728"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "画像がどういうデバイスから得られたか。通常3=DSC"}
     {:rdf/language "en",
      :rdf/value
      "The image source. If a DSC recorded the image, this tag value of this tag always be set to 3, indicating that the image was recorded on a DSC."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FileSource"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def flash
  {:db/ident           :exif/flash,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "37385"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "ja",
                          :rdf/value    "フラッシュ発光の状態"}
                         {:rdf/language "en",
                          :rdf/value
                          "The status of flash when the image was shot."}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Flash"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def flashEnergy
  {:db/ident :exif/flashEnergy,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41483"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The strobe energy at the time the image is captured, as measured in Beam Candle Power Seconds (BCPS)."}
     {:rdf/language "ja",
      :rdf/value    "BCPSによるストロボの強度"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FlashEnergy"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def flashpixVersion
  {:db/ident :exif/flashpixVersion,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "40960"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FlashpixVersion"},
   :rdfs/subPropertyOf :exif/versionInfo})

(def focalLength
  {:db/ident :exif/focalLength,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37386"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "レンズの焦点距離。単位はmm"}
     {:rdf/language "en",
      :rdf/value
      "The actual focal length of the lens, in mm. Conversion is not made to the focal length of a 35 mm film camera."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FocalLength"},
   :rdfs/subPropertyOf #{:exif/pictTaking :exif/mm}})

(def focalLengthIn35mmFilm
  {:db/ident :exif/focalLengthIn35mmFilm,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41989"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The equivalent focal length assuming a 35mm film camera, in mm. A value of 0 means the focal length is unknown. Note that this tag differs from the FocalLength tag."}
     {:rdf/language "ja",
      :rdf/value    "35mm換算した焦点距離"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FocalLengthIn35mmFilm"},
   :rdfs/subPropertyOf #{:exif/length :exif/pictTaking}})

(def focalPlaneResolutionUnit
  {:db/ident :exif/focalPlaneResolutionUnit,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41488"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The unit for measuring FocalPlaneXResolution and FocalPlaneYResolution. This value is the same as the ResolutionUnit."}
     {:rdf/language "ja",
      :rdf/value    "CCD画素密度の単位"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FocalPlaneResolutionUnit"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def focalPlaneXResolution
  {:db/ident :exif/focalPlaneXResolution,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41486"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value
      "撮影画像のCCD位置での水平解像度。この値とFocalPlaneYResolution、FocalLengthを使うと、レンズ焦点距離の35mmカメラ換算値が計算できる。例えば200万画素機を使いVGAモードの画像を撮ったような場合はこの値はVGAの解像度でリサンプルされた値になっており、CCDの画素ピッチそのままの値ではないので注意が必要"}
     {:rdf/language "en",
      :rdf/value
      "The number of pixels in the image width (X) direction per FocalPlaneResolutionUnit on the camera focal plane."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FocalPlaneXResolution"},
   :rdfs/subPropertyOf #{:exif/pictTaking :exif/resolution}})

(def focalPlaneYResolution
  {:db/ident :exif/focalPlaneYResolution,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41487"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "撮影画像のCCD位置での垂直解像度"}
     {:rdf/language "en",
      :rdf/value
      "The number of pixels in the image height (Y) direction per FocalPlaneResolutionUnit on the camera focal plane."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FocalPlaneYResolution"},
   :rdfs/subPropertyOf #{:exif/pictTaking :exif/resolution}})

(def gainControl
  {:db/ident           :exif/gainControl,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "41991"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "The degree of overall image gain adjustment."},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "GainControl"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def geo
  {:db/ident :exif/geo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Geometric data such as latitude, longitude and altitude. Usually saved as rational number."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Geometric data"}})

(def gpsAltitude
  {:db/ident :exif/gpsAltitude,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "6"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSAltitude"},
   :rdfs/subPropertyOf #{:exif/gpsInfo :exif/geo}})

(def gpsAltitudeRef
  {:db/ident :exif/gpsAltitudeRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "5"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSAltitudeRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsAreaInformation
  {:db/ident :exif/gpsAreaInformation,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "28"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSAreaInformation"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDOP
  {:db/ident :exif/gpsDOP,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "11"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDOP"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDateStamp
  {:db/ident :exif/gpsDateStamp,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "29"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDateStamp"},
   :rdfs/subPropertyOf #{:exif/gpsInfo :exif/date}})

(def gpsDestBearing
  {:db/ident :exif/gpsDestBearing,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "24"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The bearing to the destination point. The range of values is from 0.00 to 359.99."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDestBearing"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestBearingRef
  {:db/ident :exif/gpsDestBearingRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "23"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDestBearingRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestDistance
  {:db/ident           :exif/gpsDestDistance,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "26"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The distance to the destination point."},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "GPSDestDistance"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestDistanceRef
  {:db/ident :exif/gpsDestDistanceRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "25"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDestDistanceRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestLatitude
  {:db/ident :exif/gpsDestLatitude,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "20"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDestLatitude"},
   :rdfs/subPropertyOf #{:exif/gpsInfo :exif/geo}})

(def gpsDestLatitudeRef
  {:db/ident           :exif/gpsDestLatitudeRef,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "19"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Reference for latitude of destination"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "GPSDestLatitudeRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestLongitude
  {:db/ident :exif/gpsDestLongitude,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "22"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDestLongitude"},
   :rdfs/subPropertyOf #{:exif/gpsInfo :exif/geo}})

(def gpsDestLongitudeRef
  {:db/ident           :exif/gpsDestLongitudeRef,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "21"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Reference for longitude of destination"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "GPSDestLongitudeRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDifferential
  {:db/ident :exif/gpsDifferential,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "30"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether differential correction is applied to the GPS receiver."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSDifferential"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsImgDirection
  {:db/ident :exif/gpsImgDirection,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "17"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The direction of the image when it was captured. The range of values is from 0.00 to 359.99."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSImgDirection"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsImgDirectionRef
  {:db/ident :exif/gpsImgDirectionRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "16"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSImgDirectionRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsInfo
  {:db/ident           :exif/gpsInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "An attribute relating to GPS information"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "GPS Info"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def gpsInfo_IFD_Pointer
  {:db/ident :exif/gpsInfo_IFD_Pointer,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "34853"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "GPS IFDへのポインタ"}
     {:rdf/language "en",
      :rdf/value
      "A pointer to the GPS IFD, which is a set of tags for recording GPS information."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSInfo IFD Pointer"},
   :rdfs/subPropertyOf :exif/ifdPointer})

(def gpsLatitude
  {:db/ident :exif/gpsLatitude,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "2"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The latitude, expressed as three values giving the degrees, minutes, and seconds, respectively."}
     {:rdf/language "ja",
      :rdf/value    "緯度"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSLatitude"},
   :rdfs/subPropertyOf #{:exif/gpsInfo :exif/geo}})

(def gpsLatitudeRef
  {:db/ident :exif/gpsLatitudeRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "1"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicates whether the latitude is north or south latitude. The ASCII value 'N' indicates north latitude, and 'S' is south latitude."}
     {:rdf/language "ja",
      :rdf/value    "緯度の北緯もしくは南緯"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSLatitudeRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsLongitude
  {:db/ident :exif/gpsLongitude,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "4"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "経度"}
     {:rdf/language "en",
      :rdf/value
      "The longitude, expressed as three values giving the degrees, minutes, and seconds, respectively."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSLongitude"},
   :rdfs/subPropertyOf #{:exif/gpsInfo :exif/geo}})

(def gpsLongitudeRef
  {:db/ident :exif/gpsLongitudeRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "3"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "経度の東経もしくは西経"}
     {:rdf/language "en",
      :rdf/value
      "Indicates whether the longitude is east or west longitude. ASCII 'E' indicates east longitude, and 'W' is west longitude."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSLongitudeRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsMapDatum
  {:db/ident :exif/gpsMapDatum,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "18"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The geodetic survey data used by the GPS receiver. If the survey data is restricted to Japan, the value of this tag is 'TOKYO' or 'WGS-84'. If a GPS Info tag is recorded, it is strongly recommended that this tag be recorded."}
     {:rdf/language "ja",
      :rdf/value    "測地系。日本なら'TOKYO'もしくは'WGS-84'"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSMapDatum"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsMeasureMode
  {:db/ident :exif/gpsMeasureMode,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "10"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSMeasureMode"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsProcessingMethod
  {:db/ident :exif/gpsProcessingMethod,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "27"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSProcessingMethod"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsSatellites
  {:db/ident :exif/gpsSatellites,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "8"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSSatellites"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsSpeed
  {:db/ident           :exif/gpsSpeed,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "13"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The speed of GPS receiver movement."},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "GPSSpeed"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsSpeedRef
  {:db/ident :exif/gpsSpeedRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "12"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSSpeedRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsStatus
  {:db/ident :exif/gpsStatus,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "9"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSStatus"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsTimeStamp
  {:db/ident :exif/gpsTimeStamp,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "7"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSTimeStamp"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsTrack
  {:db/ident :exif/gpsTrack,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "15"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSTrack"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsTrackRef
  {:db/ident :exif/gpsTrackRef,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "14"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSTrackRef"},
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsVersionID
  {:db/ident :exif/gpsVersionID,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "0"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPSVersionID"},
   :rdfs/subPropertyOf #{:exif/versionInfo :exif/gpsInfo}})

(def height
  {:db/ident           :exif/height,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Height of an object"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Height"},
   :rdfs/subPropertyOf :exif/length})

(def ifdPointer
  {:db/ident           :exif/ifdPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A tag that refers a child IFD"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "IFD Pointer"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageConfig
  {:db/ident           :exif/imageConfig,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An attribute relating to Image Configuration"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Image Config"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDataCharacter
  {:db/ident           :exif/imageDataCharacter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An attribute relating to image data characteristics"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Image Data Character"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDataStruct
  {:db/ident           :exif/imageDataStruct,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An attribute relating to image data structure"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Image Data Structure"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDescription
  {:db/ident :exif/imageDescription,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "270"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A character string giving the title of the image. It may be a comment such as \"1988 company picnic\" or the like. Two-byte character codes cannot be used. When a 2-byte code is necessary, the Exif Private tag UserComment is to be used."}
     {:rdf/language "ja",
      :rdf/value    "この画像についての説明。漢字等の2バイト文字の使用は禁止"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ImageDescription"},
   :rdfs/subPropertyOf #{:dc11/title :exif/exifAttribute}})

(def imageLength
  {:db/ident :exif/imageLength,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "257"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ImageLength"},
   :rdfs/subPropertyOf #{:exif/imageDataStruct :exif/height}})

(def imageUniqueID
  {:db/ident :exif/imageUniqueID,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "42016"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ImageUniqueID"},
   :rdfs/subPropertyOf #{:exif/exifAttribute :dc11/identifier}})

(def imageWidth
  {:db/ident :exif/imageWidth,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "256"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ImageWidth"},
   :rdfs/subPropertyOf #{:exif/imageDataStruct :exif/width}})

(def interopInfo
  {:db/ident :exif/interopInfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An attribute relating to Interoperability. Tags stored in\nInteroperability IFD may be defined dependently to each Interoperability rule."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interoperability Info"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def interoperabilityIndex
  {:db/ident :exif/interoperabilityIndex,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "1"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value
      "メイン画像のInteroperability IFDで、データの内容がExifR98 v1.0準拠の場合は、'R98'の文字列。サムネィル画像のInteroperability IFDの場合は、'THM'の文字列"}
     {:rdf/language "en",
      :rdf/value
      "Indicates the identification of the Interoperability rule. 'R98' = conforming to R98 file specification of Recommended Exif Interoperability Rules (ExifR98) or to DCF basic file stipulated by Design Rule for Camera File System. 'THM' = conforming to DCF thumbnail file stipulated by Design rule for Camera File System."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "InteroperabilityIndex"},
   :rdfs/subPropertyOf :exif/interopInfo})

(def interoperabilityVersion
  {:db/ident           :exif/interoperabilityVersion,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "2"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "en",
                          :rdf/value    "Interoperability Version"}
                         {:rdf/language "ja",
                          :rdf/value "データの内容がExifR98 v1.0準拠の場合は、'0100'の文字列。"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "InteroperabilityVersion"},
   :rdfs/subPropertyOf :exif/interopInfo})

(def interoperability_IFD_Pointer
  {:db/ident :exif/interoperability_IFD_Pointer,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "40965"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "Interoperability IFDへのポインタ"}
     {:rdf/language "en",
      :rdf/value
      "A pointer to the Interoperability IFD, which is composed of tags storing the information to ensure the Interoperability"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interoperability IFD Pointer"},
   :rdfs/subPropertyOf :exif/ifdPointer})

(def isoSpeedRatings
  {:db/ident :exif/isoSpeedRatings,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "34855"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "CCD感度の銀塩フィルム換算値"}
     {:rdf/language "en",
      :rdf/value
      "Indicates the ISO Speed and ISO Latitude of the camera or input device as specified in ISO 12232."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ISOSpeedRatings"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def jpegInterchangeFormat
  {:db/ident :exif/jpegInterchangeFormat,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "513"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The offset to the start byte (SOI) of JPEG compressed thumbnail data. This is not used for primary image JPEG data."}
     {:rdf/language "ja",
      :rdf/value    "圧縮されたサムネイルへのオフセット"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JPEGInterchangeFormat"},
   :rdfs/subPropertyOf :exif/recOffset})

(def jpegInterchangeFormatLength
  {:db/ident :exif/jpegInterchangeFormatLength,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "514"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The number of bytes of JPEG compressed thumbnail data. This is not used for primary image JPEG data."}
     {:rdf/language "ja",
      :rdf/value    "圧縮されたサムネイルのサイズ"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JPEGInterchangeFormatLength"},
   :rdfs/subPropertyOf :exif/recOffset})

(def length
  {:db/ident :exif/length,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Length of an object. Could be a subProperty of other general schema."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Length"}})

(def lightSource
  {:db/ident :exif/lightSource,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37384"},
   :rdf/type :rdf/Property,
   :rdfs/comment #{{:rdf/language "ja",
                    :rdf/value    "光源。これはマニュアルでホワイトバランスを設定した場合のモード値となる"}
                   {:rdf/language "en",
                    :rdf/value
                    "Light source such as Daylight, Tungsten, Flash etc."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LightSource"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def make
  {:db/ident           :exif/make,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "271"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "ja",
                          :rdf/value    "カメラのメーカー名。DCFでは必須"}
                         {:rdf/language "en",
                          :rdf/value "Manufacturer of image input equipment"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Make"},
   :rdfs/subPropertyOf #{:exif/exifAttribute :rdfs/label}})

(def makerNote
  {:db/ident           :exif/makerNote,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "37500"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "ja",
                          :rdf/value    "カメラの内部情報等、メーカー依存データ"}
                         {:rdf/language "en",
                          :rdf/value    "Manufacturer notes"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "MakerNote"},
   :rdfs/subPropertyOf :exif/userInfo})

(def maxApertureValue
  {:db/ident :exif/maxApertureValue,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37381"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "レンズの開放F値。ApertureValue同様、ルート2のベキ乗を取ると通常の絞り値に換算できる"}
     {:rdf/language "en",
      :rdf/value
      "The smallest F number of the lens. The unit is the APEX value. Ordinarily it is given in the range of 00.00 to 99.99, but it is not limited to this range."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MaxApertureValue"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def meter
  {:db/ident           :exif/meter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A length with unit of meter"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Meter"},
   :rdfs/subPropertyOf :exif/length})

(def meteringMode
  {:db/ident :exif/meteringMode,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37383"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "自動露出の測光モード"}
     {:rdf/language "en",
      :rdf/value
      "Metering mode, such as CenterWeightedAverage, Spot, MultiSpot,Pattern, Partial etc."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MeteringMode"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def mm
  {:db/ident           :exif/mm,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "A length with unit of mm"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Milimeter"},
   :rdfs/subPropertyOf :exif/length})

(def model
  {:db/ident           :exif/model,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "272"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "en",
                          :rdf/value    "Model of image input equipment"}
                         {:rdf/language "ja",
                          :rdf/value    "カメラの機種名。DCFでは必須"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Model"},
   :rdfs/subPropertyOf #{:exif/exifAttribute :rdfs/label}})

(def oecf
  {:db/ident :exif/oecf,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "34856"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OECF"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def orientation
  {:db/ident :exif/orientation,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "274"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value "The image orientation viewed in terms of rows and columns."}
     {:rdf/language "ja",
      :rdf/value    "画像データがどこ(top-leftなど）を起点として、どの向きで格納されているか"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Orientation"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def photometricInterpretation
  {:db/ident :exif/photometricInterpretation,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "262"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PhotometricInterpretation"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def pictTaking
  {:db/ident           :exif/pictTaking,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An attribute relating to Picture-Taking Conditions"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PictTaking"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def pimBrightness
  {:db/ident           :exif/pimBrightness,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "10"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "Brightness info for print image matching"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PrintIM Brightness"},
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimColorBalance
  {:db/ident           :exif/pimColorBalance,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "11"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "ColorBalance info for print image matching"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PrintIM ColorBalance"},
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimContrast
  {:db/ident           :exif/pimContrast,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "9"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Contrast info for print image matching"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PrintIM Contrast"},
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimInfo
  {:db/ident           :exif/pimInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An attribute relating to print image matching"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PIM Info"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def pimSaturation
  {:db/ident           :exif/pimSaturation,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "12"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "Saturation info for print image matching"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PrintIM Saturation"},
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimSharpness
  {:db/ident           :exif/pimSharpness,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "13"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "Sharpness info for print image matching"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PrintIM Sharpness"},
   :rdfs/subPropertyOf :exif/pimInfo})

(def pixelXDimension
  {:db/ident :exif/pixelXDimension,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "40962"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PixelXDimension"},
   :rdfs/subPropertyOf #{:exif/imageConfig :exif/width}})

(def pixelYDimension
  {:db/ident :exif/pixelYDimension,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "40963"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PixelYDimension"},
   :rdfs/subPropertyOf #{:exif/imageConfig :exif/height}})

(def planarConfiguration
  {:db/ident :exif/planarConfiguration,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "284"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PlanarConfiguration"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def primaryChromaticities
  {:db/ident :exif/primaryChromaticities,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "319"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The chromaticity of the three primary colors of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."}
     {:rdf/language "ja",
      :rdf/value
      "原色の色度。CCIR REcommendation 709 primariesを使っている場合は、'640/1000,330/1000,300/1000,600/1000,150/1000,60/1000'という値。通常はColorSpaceタグがあるので不要"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PrimaryChromaticities"},
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def printImageMatching_IFD_Pointer
  {:db/ident           :exif/printImageMatching_IFD_Pointer,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "50341"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A pointer to the print image matching IFD"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "PrintImageMatching IFD Pointer"},
   :rdfs/subPropertyOf :exif/ifdPointer})

(def recOffset
  {:db/ident           :exif/recOffset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "An attribute relating to recording offset"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Recording Offset"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def referenceBlackWhite
  {:db/ident :exif/referenceBlackWhite,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "532"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value
      "画像情報の黒点・白点値。YCbCr形式の場合、最初の２つの値がY(輝度)の黒点・白点、次がCb、最後がCrとなり、デフォルト値は'0,255,0,128,0,128'。RGB形式の場合はR、G、Bの順で黒点・白点値が並んでおり、デフォルト値は'0,255,0,255,0,255'。"}
     {:rdf/language "en",
      :rdf/value
      "The reference black point value and reference white point value. The color space is declared in a color space information tag, with the default being the value that gives the optimal image characteristics Interoperability these conditions."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ReferenceBlackWhite"},
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def relatedFile
  {:db/ident           :exif/relatedFile,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "Tag Relating to Related File Information"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Related File"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def relatedImageFileFormat
  {:db/ident :exif/relatedImageFileFormat,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "4096"},
   :rdf/type :rdf/Property,
   :rdfs/comment #{{:rdf/language "ja",
                    :rdf/value
                    "画像フォーマットを'Exif JPEG Ver. 2.1'などの文字列で示す。通常はサムネィル画像に使う"}
                   {:rdf/language "en",
                    :rdf/value    "Related image file format"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RelatedImageFileFormat"},
   :rdfs/subPropertyOf :exif/interopInfo})

(def relatedImageLength
  {:db/ident           :exif/relatedImageLength,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "4098"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "ja",
                          :rdf/value "画像高。通常はサムネイル画像のInteroperability IFDに使う"}
                         {:rdf/language "en",
                          :rdf/value    "Related image length"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "RelatedImageLength"},
   :rdfs/subPropertyOf #{:exif/height :exif/interopInfo}})

(def relatedImageWidth
  {:db/ident           :exif/relatedImageWidth,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "4097"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "ja",
                          :rdf/value "画像幅。通常はサムネイル画像のInteroperability IFDに使う"}
                         {:rdf/language "en",
                          :rdf/value    "Related image width"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "RelatedImageWidth"},
   :rdfs/subPropertyOf #{:exif/interopInfo :exif/width}})

(def relatedSoundFile
  {:db/ident           :exif/relatedSoundFile,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "40964"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "en",
                          :rdf/value    "Related audio file"}
                         {:rdf/language "ja",
                          :rdf/value    "画像と一緒に音声録音できる機種の場合に、音声ファイルの名前"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "RelatedSoundFile"},
   :rdfs/subPropertyOf :exif/relatedFile})

(def resolution
  {:db/ident :exif/resolution,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a rational number representing a resolution. Could be a subProperty of other general schema."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resolution"}})

(def resolutionUnit
  {:db/ident :exif/resolutionUnit,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "296"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "XResolution/YResolutionの解像度の単位"}
     {:rdf/language "en",
      :rdf/value
      "The unit for measuring XResolution and YResolution. The same unit is used for both XResolution and YResolution. If the image resolution in unknown, 2 (inches) is designated."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ResolutionUnit"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def rowsPerStrip
  {:db/ident :exif/rowsPerStrip,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "278"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RowsPerStrip"},
   :rdfs/subPropertyOf :exif/recOffset})

(def samplesPerPixel
  {:db/ident :exif/samplesPerPixel,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "277"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SamplesPerPixel"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def saturation
  {:db/ident :exif/saturation,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41993"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The direction of saturation processing applied by the camera when the image was shot."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saturation"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def sceneCaptureType
  {:db/ident :exif/sceneCaptureType,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41990"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SceneCaptureType"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def sceneType
  {:db/ident :exif/sceneType,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41729"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The type of scene. If a DSC recorded the image, this tag value shall always be set to 1, indicating that the image was directly photographed."}
     {:rdf/language "ja",
      :rdf/value    "画像がどうやって撮られたか。デジカメの場合は通常1=A directly photographed image"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SceneType"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def seconds
  {:db/ident     :exif/seconds,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "a mesurement of time length with unit of second"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Seconds"}})

(def sensingMethod
  {:db/ident :exif/sensingMethod,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41495"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The image sensor type on the camera or input device, such as One-chip color area sensor etc."}
     {:rdf/language "ja",
      :rdf/value
      "イメージセンサーの形式。One-chip color area sensor、Color sequential area sensor、Trilinear sensorなど"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SensingMethod"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def sharpness
  {:db/ident :exif/sharpness,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41994"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The direction of sharpness processing applied by the camera when the image was shot."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sharpness"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def shutterSpeedValue
  {:db/ident :exif/shutterSpeedValue,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37377"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Shutter speed. The unit is the APEX (Additive System of Photographic Exposure) setting"}
     {:rdf/language "ja",
      :rdf/value
      "シャッター速度（APEX値）。この値の2のベキ乗をとって逆数にすると、通常のシャッター速度表示になる。例えば'4'の場合だと1/(2^4)=1/16秒"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ShutterSpeedValue"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def software
  {:db/ident :exif/software,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "305"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "デジカメ（もしくは入力機器）の内蔵ソフトウェア/ファームウェアの名称とバージョン"}
     {:rdf/language "en",
      :rdf/value
      "The name and version of the software or firmware of the camera or image input device used to generate the image."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Software"},
   :rdfs/subPropertyOf #{:exif/exifAttribute :rdfs/label}})

(def spatialFrequencyResponse
  {:db/ident :exif/spatialFrequencyResponse,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41484"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SpatialFrequencyResponse"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def spectralSensitivity
  {:db/ident :exif/spectralSensitivity,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "34852"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SpectralSensitivity"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def stripByteCounts
  {:db/ident :exif/stripByteCounts,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "279"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "StripByteCounts"},
   :rdfs/subPropertyOf :exif/recOffset})

(def stripOffsets
  {:db/ident :exif/stripOffsets,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "273"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "StripOffsets"},
   :rdfs/subPropertyOf :exif/recOffset})

(def subSecTime
  {:db/ident           :exif/subSecTime,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "37520"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "DateTime subseconds"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "SubSecTime"},
   :rdfs/subPropertyOf #{:exif/subseconds :exif/dateAndOrTime}})

(def subSecTimeDigitized
  {:db/ident           :exif/subSecTimeDigitized,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "37522"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "DateTimeDigitized subseconds"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "SubSecTimeDigitized"},
   :rdfs/subPropertyOf #{:exif/subseconds :exif/dateAndOrTime}})

(def subSecTimeOriginal
  {:db/ident           :exif/subSecTimeOriginal,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "37521"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "DateTimeOriginal subseconds"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "SubSecTimeOriginal"},
   :rdfs/subPropertyOf #{:exif/subseconds :exif/dateAndOrTime}})

(def subjectArea
  {:db/ident :exif/subjectArea,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37396"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "画面中の主たる被写体の位置。2値によるXY座標、3値による円、4値による長方形座標の3通りの示し方がある"}
     {:rdf/language "en",
      :rdf/value
      "The location and area of the main subject in the overall scene."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SubjectArea"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def subjectDistance
  {:db/ident :exif/subjectDistance,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37382"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "被写体までの距離。単位はm"}
     {:rdf/language "en",
      :rdf/value
      "The distance to the subject, given in meters. Note that if the numerator of the recorded value is FFFFFFFF.H, Infinity shall be indicated; and if the numerator is 0, Distance unknown shall be indicated."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SubjectDistance"},
   :rdfs/subPropertyOf #{:exif/meter :exif/pictTaking}})

(def subjectDistanceRange
  {:db/ident :exif/subjectDistanceRange,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41996"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The distance to the subject, such as Macro, Close View or Distant View."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SubjectDistanceRange"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def subjectLocation
  {:db/ident :exif/subjectLocation,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "41492"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "画面中の主要被写体のXY座標"}
     {:rdf/language "en",
      :rdf/value
      "The location of the main subject in the scene. The value of this tag represents the pixel at the center of the main subject relative to the left edge, prior to rotation processing as per the Rotation tag. The first value indicates the X column number and second indicates the Y row number."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SubjectLocation"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def subseconds
  {:db/ident :exif/subseconds,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A tag used to record fractions of seconds for a date property"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Subseconds"}})

(def tag_number
  {:db/ident           :exif/tag_number,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The Exif tag number"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Tag number"},
   :rdfs/subPropertyOf :dc11/identifier})

(def tagid
  {:db/ident :exif/tagid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Exif tag number with context prefix, such as IFD type or maker name"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tag ID"},
   :rdfs/subPropertyOf :exif/tag_number})

(def transferFunction
  {:db/ident :exif/transferFunction,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "301"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TransferFunction"},
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def userComment
  {:db/ident :exif/userComment,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "37510"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value
      "ユーザーコメント。ImageDescriptionタグと違って、こちらはJIS2バイトコード、Unicode等での記述が許されており、最初の8バイトが文字コード"}
     {:rdf/language "en",
      :rdf/value
      "A tag for Exif users to write keywords or comments on the image besides those in ImageDescription, and without the character code limitations of the ImageDescription tag. The character code used in the UserComment tag is identified based on an ID code in a fixed 8-byte area at the start of the tag data area."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "UserComment"},
   :rdfs/subPropertyOf :exif/userInfo})

(def userInfo
  {:db/ident           :exif/userInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "An attribute relating to User Information"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "User Info"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def versionInfo
  {:db/ident           :exif/versionInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An attribute relating to Version"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Version Info"},
   :rdfs/subPropertyOf :exif/exifAttribute})

(def whiteBalance
  {:db/ident           :exif/whiteBalance,
   :exif/tag_number    {:rdf/language "en",
                        :rdf/value    "41987"},
   :rdf/type           :rdf/Property,
   :rdfs/comment       #{{:rdf/language "en",
                          :rdf/value
                          "The white balance mode set when the image was shot."}
                         {:rdf/language "ja",
                          :rdf/value    "ホワイトバランスのモード"}},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "WhiteBalance"},
   :rdfs/subPropertyOf :exif/pictTaking})

(def whitePoint
  {:db/ident :exif/whitePoint,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "318"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The chromaticity of the white point of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."}
     {:rdf/language "ja",
      :rdf/value
      "白点の色度。CIE Standard Illuminant D65(いわゆる昼光色の世界標準値)を使っていれば、'3127/10000,3290/10000'という値。通常はColorSpaceタグがあるので不要"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "WhitePoint"},
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def width
  {:db/ident           :exif/width,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Width of an object"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Width"},
   :rdfs/subPropertyOf :exif/length})

(def xResolution
  {:db/ident :exif/xResolution,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "282"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "画像の表示・印刷時の水平解像度"}
     {:rdf/language "en",
      :rdf/value
      "The number of pixels per ResolutionUnit in the ImageWidth direction. When the image resolution is unknown, 72 [dpi] is designated."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "XResolution"},
   :rdfs/subPropertyOf #{:exif/imageDataStruct :exif/resolution}})

(def yCbCrCoefficients
  {:db/ident :exif/yCbCrCoefficients,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "529"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "RGB形式からYCbCr形式に変換するための3つの係数。通常は0.299、0.587、0.114という値"}
     {:rdf/language "en",
      :rdf/value
      "The matrix coefficients for transformation from RGB to YCbCr image data."}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "YCbCrCoefficients"},
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def yCbCrPositioning
  {:db/ident :exif/yCbCrPositioning,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "531"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The position of chrominance components in relation to the luminance component. This field is designated only for JPEG compressed data or uncompressed YCbCr data."}
     {:rdf/language "ja",
      :rdf/value
      "色情報のサンプリングを間引きしている場合に、色情報のサンプルポイントがどこになるか。1='centered'なら点集合の中央、2＝'co-sited'なら点集合の原点"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "YCbCrPositioning"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def yCbCrSubSampling
  {:db/ident :exif/yCbCrSubSampling,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "530"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "YCbCrSubSampling"},
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def yResolution
  {:db/ident :exif/yResolution,
   :exif/tag_number {:rdf/language "en",
                     :rdf/value    "283"},
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The number of pixels per ResolutionUnit in the ImageLength direction. The same value as XResolution is designated."}
     {:rdf/language "ja",
      :rdf/value    "画像の表示・印刷時の垂直解像度"}},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "YResolution"},
   :rdfs/subPropertyOf #{:exif/imageDataStruct :exif/resolution}})

(def urn:uuid:4332ef38-0343-5937-a825-ee072539acad
  {:foaf/name    {:rdf/language "ja",
                  :rdf/value    "神崎正英"},
   :rdf/type     :foaf/Person,
   :rdfs/seeAlso {:xsd/anyURI "http://www.kanzaki.com/info/webwho.rdf"},
   :xsd/anyURI   "urn:pin:MK705"})

(def urn:uuid:08c88d5c-69bc-52d9-a5a4-d852f91655e1
  {:dc11/format {:rdf/language "en",
                 :rdf/value    "PDF"},
   :dc11/title  {:rdf/language "en",
                 :rdf/value    "JEITA CP-3451/EXIF 2.2 Specification"},
   :xsd/anyURI  "http://tsc.jeita.or.jp/avs/data/cp3451.pdf"})

(def urn:uuid:ee5fea12-20d3-5804-89a6-985cd1470a87
  {:dc11/description
   #{{:rdf/language "fr",
      :rdf/value
      "Vocabulaire pour décrire les données Exif d'une photographie. Toutes les balises Exif 2.2 sont définies comme des propriétés RDF, ainsi que plusieurs termes pour donner de l'aide."}
     {:rdf/language "ja",
      :rdf/value
      "Exifフォーマットの写真からデータを取りだしてRDFで表現するため、Exif 2.2の全てのタグをRDFプロパティとして定義し、さらにそれを記述するのに必要な語彙を追加したボキャブラリ"}
     {:rdf/language "en",
      :rdf/value
      "Vocabulary to describe an Exif format picture data. All Exif 2.2 tags are defined as RDF properties, as well as several terms to help this schema."}},
   :dc11/source {:xsd/anyURI "http://tsc.jeita.or.jp/avs/data/cp3451.pdf"},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Exif data description vocabulary"},
   :dcterms/created {:rdf/language "en",
                     :rdf/value    "2003-07-18"},
   :dcterms/modified {:rdf/language "en",
                      :rdf/value    "2003-08-19"},
   :foaf/maker {:xsd/anyURI "urn:pin:MK705"},
   :owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Experimental version."},
   :rdf/type :owl/Ontology,
   :xsd/anyURI "http://www.w3.org/2003/12/exif/ns"})